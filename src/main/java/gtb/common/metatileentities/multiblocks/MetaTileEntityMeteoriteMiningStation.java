package gtb.common.metatileentities.multiblocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockBoilerCasing.BoilerCasingType;
import gregtech.common.blocks.BlockFireboxCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;

import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityMeteoriteMiningStation extends RecipeMapMultiblockController {

    public MetaTileEntityMeteoriteMiningStation(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.METEORITE_MINING);
    }

    public IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle(
                        "~FFFFFFF~",
                        "FPPPPPPPF",
                        "FPCCCCCPF",
                        "FPCCCCCPF",
                        "FPCCCCCPF",
                        "FPCCCCCPF",
                        "FPCCCCCPF",
                        "PPPPPPPPP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PCCCCCCCP",
                        "PPPPPPPPP")
                .aisle(
                        "~F~~~~~F~",
                        "FP~~~~~PF",
                        "~~~~F~~~~",
                        "~~~GGG~~~",
                        "~~FGGGF~~",
                        "~~~GGG~~~",
                        "~~~~~~~~~",
                        "FP~~~~~PF",
                        "~~~~~~~~~",
                        "FFF~~~FFF",
                        "FCC~~~CCF",
                        "FFF~~~FFF",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "FFF~~~FFF",
                        "FCC~~~CCF",
                        "FFF~~~FFF",
                        "~~~~~~~~~",
                        "~~~~P~~~~")
                .aisle(
                        "~F~~~~~F~",
                        "FP~~~~~PF",
                        "~~~~F~~~~",
                        "~~~CCC~~~",
                        "~~FCCCF~~",
                        "~~~CCC~~~",
                        "~~~PPP~~~",
                        "FP~~P~~PF",
                        "~~~~P~~~~",
                        "~F~~~~~F~",
                        "FC~~~~~CF",
                        "~F~~~~~F~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~F~~~~~F~",
                        "FC~~~~~CF",
                        "~F~~~~~F~",
                        "~~~~~~~~~",
                        "~~~~S~~~~")
                .aisle(
                        "~F~~~~~F~",
                        "FP~~~~~PF",
                        "~~~~F~~~~",
                        "~~~CCC~~~",
                        "~~FCCCF~~",
                        "~~~PCP~~~",
                        "~~~PPP~~~",
                        "FP~PPP~PF",
                        "~~~PPP~~~",
                        "~F~~P~~F~",
                        "FC~~P~~CF",
                        "~F~~G~~F~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~F~~~~~F~",
                        "FC~~~~~CF",
                        "~F~~~~~F~",
                        "~~~~~~~~~",
                        "~~~~~~~~~")
                .aisle(
                        "~F~~~~~F~",
                        "FP~~~~~PF",
                        "~~~~F~~~~",
                        "~~~CCC~~~",
                        "~~FCCCF~~",
                        "~~~CCC~~~",
                        "~~~PPP~~~",
                        "FP~~P~~PF",
                        "~~~~P~~~~",
                        "~F~~~~~F~",
                        "FC~~~~~CF",
                        "~F~~~~~F~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~F~~~~~F~",
                        "FC~~~~~CF",
                        "~F~~~~~F~",
                        "~~~~~~~~~",
                        "~~~~~~~~~")
                .aisle(
                        "~F~~~~~F~",
                        "FP~~~~~PF",
                        "~~~~~~~~~",
                        "~~~~F~~~~",
                        "~~~FFF~~~",
                        "~~~~F~~~~",
                        "~~~~~~~~~",
                        "FP~~~~~PF",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~F~~~~~F~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~F~~~~~F~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~~~~~~~~~")
                .aisle(
                        "~FFFFFFF~",
                        "FPPPPPPPF",
                        "FP~~~~~PF",
                        "FP~~~~~PF",
                        "FP~~~~~PF",
                        "FP~~~~~PF",
                        "FP~~~~~PF",
                        "FPPPPPPPF",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~FF~~~FF~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~FF~~~FF~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~",
                        "~FFFFFFF~",
                        "~F~~~~~F~",
                        "~F~~~~~F~",
                        "~F~~~~~F~",
                        "~F~~~~~F~",
                        "~F~~~~~F~",
                        "~FFFFFFF~",
                        "~~~~F~~~~",
                        "~~~~F~~~~",
                        "~~FFFFF~~",
                        "~~~~F~~~~",
                        "~~~~F~~~~",
                        "~~~~F~~~~",
                        "~~~~F~~~~",
                        "~~FFFFF~~",
                        "~~~~~~~~~",
                        "~~~~~~~~~",
                        "~~~~~~~~~")
                .where('S', selfPredicate())
                .where('G',
                        states(MetaBlocks.BOILER_FIREBOX_CASING
                                .getState(BlockFireboxCasing.FireboxCasingType.STEEL_FIREBOX)))
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(134)
                        .or(autoAbilities()))
                .where('F', frames(Materials.Steel))
                .where('P', states(MetaBlocks.BOILER_CASING.getState((BoilerCasingType.STEEL_PIPE))))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, true, true, true, true);
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
        return new MetaTileEntityMeteoriteMiningStation(metaTileEntityId);
    }
}
