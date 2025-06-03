package gtb.common.metatileentities.multiblocks;

import static com.codetaylor.mc.pyrotech.modules.core.ModuleCore.Blocks.REFRACTORY_BRICK;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;

import gtb.api.NoEnergyLogic;
import gtb.api.NoEnergyMultiController;
import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityLargeBloomery extends NoEnergyMultiController {

    public MetaTileEntityLargeBloomery(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.BLOOMERY_RECIPES);
        this.recipeMapWorkable = new NoEnergyLogic(this);
    }

    public IBlockState getCasingState() {
        return REFRACTORY_BRICK.getDefaultState();
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle("CCC", "CCC", "CCC", "CSC")
                .aisle("CCC", "C~C", "C~C", "CCC")
                .aisle("~C~", "~C~", "~C~", "~C~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState())
                        .or(abilities(MultiblockAbility.IMPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.EXPORT_FLUIDS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.IMPORT_ITEMS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.STEAM_EXPORT_ITEMS).setExactLimit(1))
                        .or(abilities(MultiblockAbility.STEAM_IMPORT_ITEMS).setExactLimit(1)))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(false, false, true, true, false, false, false);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.COKE_BRICKS;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityLargeBloomery(metaTileEntityId);
    }
}
