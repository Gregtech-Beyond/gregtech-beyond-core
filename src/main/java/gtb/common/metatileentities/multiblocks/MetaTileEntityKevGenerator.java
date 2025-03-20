package gtb.common.metatileentities.multiblocks;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.capability.IControllable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import com.google.common.collect.Lists;

import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.EnergyContainerList;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.MultiblockWithDisplayBase;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.capabilities.GTBMultiblockAbilities;
import gtb.api.capabilities.KevContainer;

public class MetaTileEntityKevGenerator extends MultiblockWithDisplayBase implements IControllable {

    private IEnergyContainer energyContainer;
    private KevContainer kevContainer;
    private boolean isWorkingEnabled;
    private int kevProduction;
    private final long euConsumption = 1024;
    private final int baseKevProduction = 300;

    public MetaTileEntityKevGenerator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId);
    }

    private void initializeAbilities() {
        this.energyContainer = new EnergyContainerList(getAbilities(MultiblockAbility.INPUT_ENERGY));
        this.kevContainer = new KevContainer(this, false);
    }

    private void resetTileAbilities() {
        this.energyContainer = new EnergyContainerList(Lists.newArrayList());
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);
        initializeAbilities();
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        resetTileAbilities();
    }

    private void calculateKevProduction() {

    }

    @Override
    protected void updateFormedValid() {}

    @Override
    public boolean isWorkingEnabled() {
        return this.isWorkingEnabled;
    }

    @Override
    public void setWorkingEnabled(boolean isWorkingAllowed) {
        this.isWorkingEnabled = isWorkingAllowed;
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("CCC", "CSC", "CCC")
                .aisle("CCC", "CAC", "CCC")
                .aisle("CCC", "CCC", "CCC")
                .where('S', selfPredicate())
                .where('A', air())
                .where('C', states(getCasingState()).setMinGlobalLimited(18)
                        .or(autoAbilities())
                        .or(abilities(GTBMultiblockAbilities.KEV_CONTAINER_OUTPUT).setExactLimit(1))
                        .or(abilities(MultiblockAbility.INPUT_ENERGY).setMaxGlobalLimited(2)))
                .build();
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        getFrontOverlay().renderOrientedState(renderState, translation, pipeline, getFrontFacing(), this.isActive(),
                this.isWorkingEnabled());
    }


    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.SOLID_STEEL_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityKevGenerator(metaTileEntityId);
    }
}
