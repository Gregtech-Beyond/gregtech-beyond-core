package gtb.common.metatileentities.multiblocks;

import gtb.api.recipes.properties.AltitudeProperty;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockUniqueCasing;
import gregtech.api.block.VariantActiveBlock;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockFusionCasing;
import gregtech.common.blocks.MetaBlocks;
import gtb.api.pattern.GTBTraceabilityPredicate;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.render.GTBTextures;
import gtb.api.unification.materials.GTBMaterials;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.GTBBlockGlassCasing;
import gtb.common.block.blocks.GTBMultiblockCasing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;
import org.lwjgl.input.Keyboard;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import java.util.LinkedList;
import java.util.List;

public class MetaTileEntityCosmicRayDetector extends RecipeMapMultiblockController {
    private BlockPos topBlockPos = new BlockPos(0, -64, 0);

    public MetaTileEntityCosmicRayDetector(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.COSMIC_RAY_DETECTOR_RECIPES);
        this.recipeMapWorkable = new CosmicRayDetectorLogic(this);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityCosmicRayDetector(metaTileEntityId);
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "      XXX      ",
                        "               ")
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "      XXX      ",
                        "    XX   XX    ",
                        "               ")
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "       X       ",
                        "    XXX XXX    ",
                        "   X       X   ",
                        "               ")
                .aisle(
                        "      CCC      ",
                        "      CCC      ",
                        "      CCC      ",
                        "               ",
                        "               ",
                        "       C       ",
                        "     XXXXX     ",
                        "   XX     XX   ",
                        "  X         X  ",
                        "               ")
                .aisle(
                        "     CCCCC     ",
                        "     C   C     ",
                        "     C   C     ",
                        "      CCC      ",
                        "      CCC      ",
                        "     CCCCC     ",
                        "    XXXXXXX    ",
                        "  XX       XX  ",
                        " X           X ",
                        "               ")
                .aisle(
                        "    CCCCCCC    ",
                        "    C     C    ",
                        "    C     C    ",
                        "     C   C     ",
                        "     C   C     ",
                        "    CCXXXCC    ",
                        "   XXX   XXX   ",
                        "  X         X  ",
                        " X           X ",
                        "               ")
                .aisle(
                        "   CCCCCCCCC   ",
                        "   C   E   C   ",
                        "   C       C   ",
                        "    C     C    ",
                        "    C  F  C    ",
                        "    CXXXXXC    ",
                        "   XX     XX   ",
                        " XX         XX ",
                        "X             X",
                        "               ")
                .aisle(
                        "   CCCCCCCCC   ",
                        "   C  ELE  C   ",
                        "   C   L   C   ",
                        "    C  L  C    ",
                        "    C FLF C    ",
                        "   CCXXEXXCC   ",
                        "  XXX  T  XXX  ",
                        " X     T     X ",
                        "X      T      X",
                        "       O       ")
                .aisle(
                        "   CCCCCCCCC   ",
                        "   C   E   C   ",
                        "   C       C   ",
                        "    C     C    ",
                        "    C  F  C    ",
                        "    CXXXXXC    ",
                        "   XX     XX   ",
                        " XX         XX ",
                        "X             X",
                        "               ")
                .aisle(
                        "    CCCCCCC    ",
                        "    C     C    ",
                        "    C     C    ",
                        "     C   C     ",
                        "     C   C     ",
                        "    CCXXXCC    ",
                        "   XXX   XXX   ",
                        "  X         X  ",
                        " X           X ",
                        "               ")
                .aisle(
                        "     CCCCC     ",
                        "     C   C     ",
                        "     C   C     ",
                        "      CCC      ",
                        "      CCC      ",
                        "     CCCCC     ",
                        "    XXXXXXX    ",
                        "  XX       XX  ",
                        " X           X ",
                        "               ")
                .aisle(
                        "      CCC      ",
                        "      CSC      ",
                        "      CCC      ",
                        "               ",
                        "               ",
                        "       C       ",
                        "     XXXXX     ",
                        "   XX     XX   ",
                        "  X         X  ",
                        "               ")
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "       X       ",
                        "    XXX XXX    ",
                        "   X       X   ",
                        "               ")
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "      XXX      ",
                        "    XX   XX    ",
                        "               ")
                .aisle(
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "               ",
                        "      XXX      ",
                        "               ")
                .where('S', selfPredicate())
                .where('C', states(getCasingAState()).or(autoAbilities()))
                .where('X', states(getCasingBState()))
                .where('E', states(getEmitterState()))
                .where('F', states(getGeneratorState()))
                .where('L', states(getCoilState()))
                .where('T', states(getFrameState()))
                .where('O', altitudePredicate(getSensorState()))
                .where(' ', any())
                .build();
    }

    @Nonnull
    protected TraceabilityPredicate altitudePredicate(IBlockState... allowedStates) {
        return new TraceabilityPredicate(blockWorldState -> {
            topBlockPos = blockWorldState.getPos();
            IBlockState state = blockWorldState.getBlockState();
            if (state.getBlock() instanceof VariantActiveBlock) {
                blockWorldState.getMatchContext().getOrPut("VABlock", new LinkedList<>()).add(blockWorldState.getPos());
            }
            return ArrayUtils.contains(allowedStates, state);
        }, GTBTraceabilityPredicate.getCandidates(allowedStates));
    }

    private boolean canSeeSky() {
        return this.getWorld().canSeeSky(topBlockPos);
    }

    private static IBlockState getCasingAState() {
        return GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(GTBMultiblockCasing.CasingType.QUANTUM_CASING);
    }
    private static IBlockState getCasingBState() {
        return GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(GTBMultiblockCasing.CasingType.REFLECTIVE_CASING);
    }
    private static IBlockState getCoilState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.SUPERCONDUCTOR_COIL);
    }
    private static IBlockState getGeneratorState() {
        return GTBMetaBlocks.GTB_MULTIBLOCK_CASING.getState(GTBMultiblockCasing.CasingType.SUBSTRATE_CASING);
    }
    private static IBlockState getEmitterState() {
        return GCYMMetaBlocks.UNIQUE_CASING.getState(BlockUniqueCasing.UniqueCasingType.HEAT_VENT);
    }
    private static IBlockState getFrameState() {
        return MetaBlocks.FRAMES.get(GTBMaterials.BlackTitanium).getBlock(GTBMaterials.BlackTitanium);
    }
    private static IBlockState getSensorState() {
        return GTBMetaBlocks.GTB_GLASS_CASING.getState(GTBBlockGlassCasing.CasingType.OSMIR_BORON_SILICATE_GLASS);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return GTBTextures.QUANTUM_CASING;
    }

    @Override
    protected void addDisplayText(List<ITextComponent> textList) {
        super.addDisplayText(textList);
        if (this.isStructureFormed()) {
            textList.add(new TextComponentTranslation("epimorphism.machine.cosmic_ray_detector.altitude", topBlockPos.getY()));
            textList.add(new TextComponentTranslation("epimorphism.machine.cosmic_ray_detector.can_see_sky." + canSeeSky()));
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, @Nonnull List<String> tooltip, boolean advanced) {
        super.addInformation(stack, world, tooltip, advanced);
        tooltip.add(I18n.format("epimorphism.machine.cosmic_ray_detector.tooltip.1"));
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
            tooltip.add(I18n.format("epimorphism.machine.cosmic_ray_detector.tooltip_shift.1"));
            tooltip.add(I18n.format("epimorphism.machine.cosmic_ray_detector.tooltip_shift.2"));
        }else {
            tooltip.add(I18n.format("gregtech.tooltip.hold_shift"));
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound data) {
        data.setIntArray("topBlockPos", new int[] {topBlockPos.getX(), topBlockPos.getY(), topBlockPos.getZ()});
        return super.writeToNBT(data);
    }

    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        int[] pos = data.getIntArray("topBlockPos");
        this.topBlockPos = new BlockPos(pos[0], pos[1], pos[2]);
    }

    protected class CosmicRayDetectorLogic extends MultiblockRecipeLogic {
        public CosmicRayDetectorLogic(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Override
        public boolean checkRecipe(@Nonnull Recipe recipe) {
            return super.checkRecipe(recipe) && recipe.getProperty(AltitudeProperty.getInstance(), -64) <= topBlockPos.getY();
        }

        @Override
        protected boolean canProgressRecipe() {
            return super.canProgressRecipe() && canSeeSky();
        }
    }
}
