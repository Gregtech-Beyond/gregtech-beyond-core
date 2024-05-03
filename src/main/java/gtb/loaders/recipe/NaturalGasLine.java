package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import gtb.api.unification.materials.GTBMaterials;

public class NaturalGasLine {

    public static void init() {
        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricAcid.getFluid(3000))
                .fluidInputs(NaturalGas.getFluid(1000))
                .fluidOutputs(GTBMaterials.AlkylatedNaturalGas.getFluid(4000))
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(GTBMaterials.AlkylatedNaturalGas.getFluid(4000))
                .fluidOutputs(Gasoline.getFluid(1000))
                .fluidOutputs(SulfuricAcid.getFluid(3000))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(NaturalGas.getFluid(1500))
                .notConsumable(dust, Nickel, 1)
                .fluidInputs(Steam.getFluid(1000))
                .fluidOutputs(GTBMaterials.Syngas.getFluid(7000))
                .blastFurnaceTemp(1200)
                .duration(200)
                .EUt(8)
                .buildAndRegister();
    }
}
