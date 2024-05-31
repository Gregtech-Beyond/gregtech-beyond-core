package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.SHAPE_EXTRUDER_INGOT;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;

public class GermaniumProcessing {

    public static void init() {
        // ZnS + 5O -> GeO2 + ZnO + SO2
        ROASTER_RECIPES.recipeBuilder()
                .input(dust, Sphalerite, 2)
                .fluidInputs(Oxygen.getFluid(5000))
                .output(dust, RoastedSphalerite, 3)
                .output(dust, ZincOxide, 2)
                .fluidOutputs(SulfurDioxide.getFluid(1000))
                .duration(200).EUt(VA[HV]).buildAndRegister();

        // GeO2 + 2Zn -> Zn2(GeO2)
        MIXER_RECIPES.recipeBuilder()
                .input(dust, RoastedSphalerite, 3)
                .input(dust, Zinc, 2)
                .output(dust, ZincRichSphalerite, 5)
                .duration(320).EUt(VA[LV]).buildAndRegister();

        // Zn2(GeO2) + H2SO4 -> ZnGeO2 + ZnSO4 + 2H (lost)
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, ZincRichSphalerite, 5)
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .output(dust, WaelzOxide)
                .output(dust, WaelzSlag, 5)
                .duration(400).EUt(VA[LV]).buildAndRegister();

        // ZnSO4 + H2O -> ZnO + H2SO4
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, WaelzSlag, 5)
                .fluidInputs(Water.getFluid(1000))
                .output(dust, ZincOxide, 2)
                .chancedOutput(dust, Gallium, 2000, 1000)
                .fluidOutputs(SulfuricAcid.getFluid(1000))
                .duration(160).EUt(VA[HV]).buildAndRegister();

        // ZnGeO2 + H2SO4 -> GeO2 + ZnSO4 + 2H (lost)
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, WaelzOxide)
                .fluidInputs(SulfuricAcid.getFluid(1000))
                .output(dust, ImpureGermaniumDioxide, 3)
                .output(dust, WaelzSlag, 5)
                .chancedOutput(dust, Manganese, 1000, 1000)
                .duration(200).EUt(VA[HV]).buildAndRegister();

        // GeO2 + 4HCl -> GeCl4 + 2H2O
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, ImpureGermaniumDioxide, 3)
                .fluidInputs(HydrochloricAcid.getFluid(4000))
                .chancedOutput(dust, Cadmium, 500, 1000)
                .fluidOutputs(GermaniumTetrachloride.getFluid(1000))
                .duration(300).EUt(VA[HV]).buildAndRegister();

        // GeCl4 + 2H2O -> GeO2 + 4HCl
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(GermaniumTetrachloride.getFluid(1000))
                .fluidInputs(Water.getFluid(2000))
                .output(dust, GermaniumDioxide, 3)
                .fluidOutputs(HydrochloricAcid.getFluid(4000))
                .duration(100).EUt(VA[LV]).buildAndRegister();

        // GeO2 + 4HCl -> GeCl4 + 2H2O
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, GermaniumDioxide, 3)
                .fluidInputs(HydrochloricAcid.getFluid(4000))
                .fluidOutputs(GermaniumTetrachloride.getFluid(1000))
                .fluidOutputs(Water.getFluid(2000))
                .duration(100).EUt(VA[LV]).buildAndRegister();

        // GeO2 + 4H -> Ge + 2H2O
        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, GermaniumDioxide, 3)
                .fluidInputs(Hydrogen.getFluid(4000))
                .output(dust, Germanium)
                .fluidOutputs(Water.getFluid(2000))
                .duration(240).EUt(VA[EV]).buildAndRegister();
    }

    public static class DamascusSteelLine {

        public static void init() {
            GTRecipeHandler.removeRecipesByInputs(CENTRIFUGE_RECIPES, OreDictUnifier.get(dust, DamascusSteel, 8));

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(plate, Steel, 8)
                    .input(plate, BlackSteel, 8)
                    .input(dust, Borax, 8)
                    .circuitMeta(16)
                    .fluidInputs(Steel.getFluid(576))
                    .output(DAMASCUS_STEEL_ASSEMBLY, 1)
                    .duration(300)
                    .EUt(512)
                    .buildAndRegister();

            BLAST_RECIPES.recipeBuilder()
                    .input(DAMASCUS_STEEL_ASSEMBLY, 1)
                    .output(HOT_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .blastFurnaceTemp(1200)
                    .duration(1200)
                    .EUt(1920)
                    .buildAndRegister();

            FORGE_HAMMER_RECIPES.recipeBuilder()
                    .input(HOT_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .output(LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .duration(160)
                    .EUt(384)
                    .buildAndRegister();

            BLAST_RECIPES.recipeBuilder()
                    .input(LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .output(HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .blastFurnaceTemp(1200)
                    .duration(1200)
                    .EUt(1920)
                    .buildAndRegister();

            FORGE_HAMMER_RECIPES.recipeBuilder()
                    .input(HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .output(MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .duration(160)
                    .EUt(384)
                    .buildAndRegister();

            BLAST_RECIPES.recipeBuilder()
                    .input(MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .output(HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .blastFurnaceTemp(1200)
                    .duration(1200)
                    .EUt(1920)
                    .buildAndRegister();

            FORGE_HAMMER_RECIPES.recipeBuilder()
                    .input(HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .output(HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .duration(160)
                    .EUt(384)
                    .buildAndRegister();

            BLAST_RECIPES.recipeBuilder()
                    .input(HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .output(HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .blastFurnaceTemp(1200)
                    .duration(1200)
                    .EUt(1920)
                    .buildAndRegister();

            EXTRUDER_RECIPES.recipeBuilder()
                    .input(HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY, 1)
                    .notConsumable(SHAPE_EXTRUDER_INGOT.getStackForm(1))
                    .output(ingot, DamascusSteel, 1)
                    .duration(160)
                    .EUt(384)
                    .buildAndRegister();

            CENTRIFUGE_RECIPES.recipeBuilder()
                    .input(dust, DamascusSteel, 1)
                    .output(dust, Steel, 8)
                    .output(dust, BlackSteel, 8)
                    .duration(84)
                    .EUt(30)
                    .buildAndRegister();
        }
    }
}
