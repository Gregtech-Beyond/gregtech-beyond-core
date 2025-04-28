package gtb.mixins.gregtech;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.util.RelativeDirection;
import gregtech.common.blocks.BlockBoilerCasing;
import gregtech.common.blocks.BlockFireboxCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.multi.electric.MetaTileEntityVacuumFreezer;

@Mixin(value = MetaTileEntityVacuumFreezer.class, remap = false)
public abstract class MixinVacuumFreezerStructure extends RecipeMapMultiblockController {

    public MixinVacuumFreezerStructure(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap) {
        super(metaTileEntityId, recipeMap);
    }

    @Shadow
    protected abstract IBlockState getCasingState();

    @Unique
    private IBlockState gregtech_beyond_core$getBoilerCasingState() {
        return MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE);
    }

    @Unique
    private IBlockState gregtech_beyond_core$getFireboxCasingState() {
        return MetaBlocks.BOILER_FIREBOX_CASING.getState(BlockFireboxCasing.FireboxCasingType.STEEL_FIREBOX);
    }

    @Unique
    private IBlockState gregtech_beyond_core$getSteelCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Inject(method = "createStructurePattern", at = @At(value = "RETURN", ordinal = 0), cancellable = true)
    public void createStructurePattern(CallbackInfoReturnable<BlockPattern> cir) {
        cir.setReturnValue(
                FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                        .aisle(
                                "~CCC~~ZZ",
                                "CCCCC~ZZ",
                                "CCCCC~~~",
                                "CCCCC~ZZ",
                                "~CCC~~ZZ")
                        .aisle(
                                "~CCC~~PP",
                                "C~~~C~PP",
                                "C~~~C~~~",
                                "C~~~C~PP",
                                "~CSC~~PP")
                        .aisle(
                                "~CCC~~PP",
                                "C~~~C~PP",
                                "C~~~C~~~",
                                "C~~~C~PP",
                                "~CCC~~PP")
                        .aisle(
                                "~CCCPPPP",
                                "C~~~C~PP",
                                "C~~~C~~~",
                                "C~~~C~PP",
                                "~CCCPPPP")
                        .aisle(
                                "~~C~~~HH",
                                "~C~C~~HH",
                                "C~~~C~~~",
                                "~C~C~~HH",
                                "~~C~~~HH")
                        .aisle(
                                "~~~~~~~~",
                                "~~C~~~~~",
                                "~CCC~~~~",
                                "~~C~~~~~",
                                "~~~~~~~~")
                        .where('S', selfPredicate())
                        .where('~', any())
                        .where('P', states(gregtech_beyond_core$getBoilerCasingState()))
                        .where('Z', states(gregtech_beyond_core$getSteelCasingState()))
                        .where('H', states(gregtech_beyond_core$getFireboxCasingState()))
                        .where('C', states(getCasingState()).setMinGlobalLimited(50)
                                .or(autoAbilities(true, false, true, true, true, true, false)))
                        .where('#', air())
                        .build());
    }
}
