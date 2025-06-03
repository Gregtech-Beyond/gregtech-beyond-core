package gtb.mixins.gregtech;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.apache.commons.lang3.ArrayUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.multiblock.RecipeMapPrimitiveMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.util.GTUtility;
import gregtech.api.util.RelativeDirection;
import gregtech.client.particle.VanillaParticleEffects;
import gregtech.client.renderer.CubeRendererState;
import gregtech.client.renderer.cclop.ColourOperation;
import gregtech.client.renderer.cclop.LightMapOperation;
import gregtech.client.renderer.texture.Textures;
import gregtech.client.utils.BloomEffectUtil;
import gregtech.common.blocks.*;
import gregtech.common.metatileentities.multi.MetaTileEntityPrimitiveBlastFurnace;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.texture.TextureUtils;
import codechicken.lib.vec.Cuboid6;
import codechicken.lib.vec.Matrix4;

@Mixin(value = MetaTileEntityPrimitiveBlastFurnace.class, remap = false)
public abstract class MixinPBFStructure extends RecipeMapPrimitiveMultiblockController {

    public MixinPBFStructure(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap) {
        super(metaTileEntityId, recipeMap);
    }

    @Unique
    private IBlockState gregtech_beyond_core$getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.PRIMITIVE_BRICKS);
    }

    @Inject(method = "createStructurePattern", at = @At(value = "RETURN", ordinal = 0), cancellable = true)
    public void createStructurePattern(CallbackInfoReturnable<BlockPattern> cir) {
        cir.setReturnValue(
                FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                        .aisle(
                                "~CCC~",
                                "CCCCC",
                                "CCCCC",
                                "CCCCC",
                                "~CCC~")
                        .aisle(
                                "~~C~~",
                                "~CAC~",
                                "CAAAC",
                                "~CAC~",
                                "~~S~~")
                        .aisle(
                                "~~C~~",
                                "~CCC~",
                                "CCACC",
                                "~CCC~",
                                "~~C~~")
                        .aisle(
                                "~~~~~",
                                "~CCC~",
                                "~CAC~",
                                "~CCC~",
                                "~~~~~")
                        .aisle(
                                "~~~~~",
                                "~~C~~",
                                "~C~C~",
                                "~~C~~",
                                "~~~~~")
                        .setRepeatable(4)
                        .where('S', selfPredicate())
                        .where('~', any())
                        .where('A', air())
                        .where('C', states(gregtech_beyond_core$getCasingState()).setMinGlobalLimited(60))
                        .build());
    }

    /**
     * Since the structure of the multi is changed and the hole is one block further in the back, lava rendering
     * must be moved one block further in the back.
     */
    @Inject(method = "renderMetaTileEntity", at = @At(value = "HEAD", ordinal = 0), cancellable = true)
    @SideOnly(Side.CLIENT)
    public void changeLavaPosition(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline,
                                   CallbackInfo ci) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        getFrontOverlay().renderOrientedState(renderState, translation, pipeline, getFrontFacing(),
                recipeMapWorkable.isActive(), recipeMapWorkable.isWorkingEnabled());
        if (recipeMapWorkable.isActive() && isStructureFormed()) {
            CubeRendererState op = Textures.RENDER_STATE.get();

            Textures.RENDER_STATE.set(new CubeRendererState(op.layer, CubeRendererState.PASS_MASK, op.world));

            Textures.renderFace(renderState,
                    gregtech_beyond_core$getNewLavaPosition(translation),
                    ArrayUtils.addAll(pipeline,
                            new LightMapOperation(240, 240),
                            new ColourOperation(0xFFFFFFFF)),
                    EnumFacing.UP,
                    Cuboid6.full,
                    TextureUtils.getBlockTexture("lava_still"),
                    BloomEffectUtil.getEffectiveBloomLayer());

            Textures.RENDER_STATE.set(op);
        }
        ci.cancel();
    }

    /**
     * @return the translation, one block further in the back/ Z-Axis.
     */
    @Unique
    private Matrix4 gregtech_beyond_core$getNewLavaPosition(Matrix4 translation) {
        EnumFacing back = getFrontFacing().getOpposite();
        return translation.copy().translate(back.getXOffset(), back.getYOffset(), back.getZOffset() + 1);
    }

    /**
     * Since the structure of the multi is changed and the hole is one block further in the back, the smoke linked
     * to the fake lava block must be emitted one block further in the back.
     */
    @Inject(method = "update", at = @At(value = "HEAD", ordinal = 0), cancellable = true)
    public void changeSmokeEffect(CallbackInfo callbackInfo) {
        super.update();
        if (this.isActive()) {
            if (getWorld().isRemote) {
                gregtech_beyond_core$doSmoke();
            } else {
                gregtech_beyond_core$damageEntitiesAndBreakSnow();
            }
        }
        callbackInfo.cancel();
    }

    /**
     * Edited version of {@link VanillaParticleEffects#PBF_SMOKE}, 1 block further in the back of the controller.
     */
    @Unique
    private void gregtech_beyond_core$doSmoke() {
        EnumFacing facing = getFrontFacing().getOpposite();
        float xPos = facing.getXOffset() * 0.76F + getPos().getX() + 0.5F;
        float yPos = facing.getYOffset() * 0.76F + getPos().getY() + 0.25F;
        float zPos = facing.getZOffset() * 0.76F + getPos().getZ() + 0.5F + 1;

        float ySpd = facing.getYOffset() * 0.1F + 0.2F + 0.1F * GTValues.RNG.nextFloat();
        getWorld().spawnParticle(EnumParticleTypes.SMOKE_LARGE, xPos, yPos, zPos, 0, ySpd, 0);
    }

    /**
     * Since the structure of the multi is changed and the hole is one block further in the back, entities damaging
     * and snow breaking effect must happen one block further in the back.
     */
    @Unique
    private void gregtech_beyond_core$damageEntitiesAndBreakSnow() {
        BlockPos newPosition = gregtech_beyond_core$getDamageAndBreakPosition();
        this.getWorld()
                .getEntitiesWithinAABB(EntityLivingBase.class, new AxisAlignedBB(newPosition))
                .forEach(entity -> entity.attackEntityFrom(DamageSource.LAVA, 3.0f));

        if (getOffsetTimer() % 10 == 0) {
            IBlockState state = getWorld().getBlockState(newPosition);
            GTUtility.tryBreakSnow(getWorld(), newPosition, state, true);
        }
    }

    /**
     * @return the position of the block in the back of the controller, + 1.
     */
    @Unique
    private BlockPos gregtech_beyond_core$getDamageAndBreakPosition() {
        BlockPos middlePos = this.getPos();
        return middlePos.offset(getFrontFacing().getOpposite(), 2);
    }
}
