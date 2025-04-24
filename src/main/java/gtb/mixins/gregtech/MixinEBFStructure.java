package gtb.mixins.gregtech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.MultiblockShapeInfo;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.util.RelativeDirection;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.*;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.common.metatileentities.multi.electric.MetaTileEntityElectricBlastFurnace;

@Mixin(value = MetaTileEntityElectricBlastFurnace.class, remap = false)
public abstract class MixinEBFStructure extends RecipeMapMultiblockController {

    public MixinEBFStructure(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap) {
        super(metaTileEntityId, recipeMap);
    }

    @Shadow
    protected abstract IBlockState getCasingState();

    @Unique
    protected IBlockState gregtech_beyond_core$getSteelCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Unique
    protected IBlockState gregtech_beyond_core$getSteelFireboxState() {
        return MetaBlocks.BOILER_FIREBOX_CASING.getState(BlockFireboxCasing.FireboxCasingType.STEEL_FIREBOX);
    }

    @Unique
    protected IBlockState gregtech_beyond_core$getSteelBoilerCasingState() {
        return MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE);
    }

    @Unique
    protected IBlockState gregtech_beyond_core$getGearCasingState() {
        return MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.STEEL_GEARBOX);
    }

    @Inject(method = "createStructurePattern", at = @At(value = "RETURN", ordinal = 0), cancellable = true)
    public void createStructurePattern(CallbackInfoReturnable<BlockPattern> cir) {
        cir.setReturnValue(
                FactoryBlockPattern.start(RelativeDirection.FRONT, RelativeDirection.UP, RelativeDirection.RIGHT)
                        .aisle("-GG--", "-CC--", "-HH--", "-CC--", "-PP--", "-FF--", "-----", "-----").setRepeatable(2)
                        .aisle("-----", "-----", "--P--", "-----", "-----", "-----", "-----", "-----")
                        .aisle("-III-", "--I--", "--P--", "-----", "-----", "-----", "-----", "-----")
                        .aisle("IIIII", "-III-", "-HHH-", "-HHH-", "-III-", "--I--", "--I--", "--I--")
                        .aisle("IIIII", "SIIII", "IHAHI", "-HAH-", "-IAI-", "-IAI-", "-IAI-", "-IMI-")
                        .aisle("IIIII", "-III-", "-HHH-", "-HHH-", "-III-", "--I--", "--I--", "--I--")
                        .aisle("-III-", "--I--", "--P--", "-----", "-----", "-----", "-----", "-----")
                        .aisle("-----", "-----", "--P--", "-----", "-----", "-----", "-----", "-----")
                        .aisle("-GG--", "-CC--", "-HH--", "-CC--", "-PP--", "-FF--", "-----", "-----").setRepeatable(2)
                        .where('-', any())
                        .where('A', air())
                        .where('S', selfPredicate())
                        .where('G', states(gregtech_beyond_core$getGearCasingState()))
                        .where('C', states(gregtech_beyond_core$getSteelCasingState()))
                        .where('F', states(gregtech_beyond_core$getSteelFireboxState()))
                        .where('P', states(gregtech_beyond_core$getSteelBoilerCasingState()))
                        .where('I', states(getCasingState()).setMinGlobalLimited(45)
                                .or(autoAbilities(true, true, true, true, true, true, false)))
                        .where('H', heatingCoils())
                        .where('M', abilities(MultiblockAbility.MUFFLER_HATCH))
                        .build());
    }

    @Inject(method = "getMatchingShapes", at = @At(value = "RETURN", ordinal = 0), cancellable = true)
    public void getMatchingShapes(CallbackInfoReturnable<List<MultiblockShapeInfo>> cir) {
        ArrayList<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
        MultiblockShapeInfo.Builder builder = MultiblockShapeInfo.builder()
                .aisle("--GG-", "--CC-", "--HH-", "--CC-", "--PP-", "--FF-", "-----", "-----")
                .aisle("--GG-", "--CC-", "--HH-", "--CC-", "--PP-", "--FF-", "-----", "-----")
                .aisle("-----", "-----", "--P--", "-----", "-----", "-----", "-----", "-----")
                .aisle("-III-", "--I--", "--P--", "-----", "-----", "-----", "-----", "-----")
                .aisle("IIIIB", "-IIE-", "-HHH-", "-HHH-", "-III-", "--I--", "--I--", "--I--")
                .aisle("IIIIK", "IIIIS", "IH-HI", "-H-H-", "-O-I-", "-I-I-", "-I-I-", "-IMI-")
                .aisle("IIIIL", "-IID-", "-HHH-", "-HHH-", "-III-", "--I--", "--I--", "--I--")
                .aisle("-III-", "--I--", "--P--", "-----", "-----", "-----", "-----", "-----")
                .aisle("-----", "-----", "--P--", "-----", "-----", "-----", "-----", "-----")
                .aisle("--GG-", "--CC-", "--HH-", "--CC-", "--PP-", "--FF-", "-----", "-----")
                .aisle("--GG-", "--CC-", "--HH-", "--CC-", "--PP-", "--FF-", "-----", "-----")
                .where('-', Blocks.AIR.getDefaultState())
                .where('S', MetaTileEntities.ELECTRIC_BLAST_FURNACE, EnumFacing.EAST)
                .where('G', gregtech_beyond_core$getGearCasingState())
                .where('C', gregtech_beyond_core$getSteelCasingState())
                .where('F', gregtech_beyond_core$getSteelFireboxState())
                .where('P', gregtech_beyond_core$getSteelBoilerCasingState())
                .where('I', getCasingState())
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GTValues.LV], EnumFacing.EAST)
                .where('B', MetaTileEntities.ITEM_IMPORT_BUS[GTValues.LV], EnumFacing.EAST)
                .where('O', MetaTileEntities.ITEM_EXPORT_BUS[GTValues.LV], EnumFacing.EAST)
                .where('L', MetaTileEntities.FLUID_IMPORT_HATCH[GTValues.LV], EnumFacing.EAST)
                .where('D', MetaTileEntities.FLUID_EXPORT_HATCH[GTValues.LV], EnumFacing.EAST)
                .where('M', MetaTileEntities.MUFFLER_HATCH[GTValues.LV], EnumFacing.UP)
                .where('K', () -> ConfigHolder.machines.enableMaintenance ? MetaTileEntities.MAINTENANCE_HATCH :
                        getCasingState(), EnumFacing.EAST);

        GregTechAPI.HEATING_COILS.entrySet().stream()
                .sorted(Comparator.comparingInt(entry -> entry.getValue().getTier()))
                .forEach(entry -> shapeInfo.add(builder.where('H', entry.getKey()).build()));
        cir.setReturnValue(shapeInfo);
    }
}
