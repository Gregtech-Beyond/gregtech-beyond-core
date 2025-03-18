package gtb.loaders.recipe.circuitry;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

public class NanoCircuitry {

    public static void init() {
        // MICRO SMD MICROCONTROLLER DIP 8
        UV_LIGHT_RECIPES.recipeBuilder()
                .input(SILICON_WAFER, 1)
                .fluidInputs(NovolacsPhotoresist.getFluid(100))
                .notConsumable(GDSII_LITHOGRAPHY_MASK)
                .output(GDSII_MASKED_WAFER, 1)
                .duration(400)
                .EUt(460)
                .buildAndRegister();

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .input(dust, Boron)
                .input(dust, WhitePhosphorus)
                .input(GDSII_MASKED_WAFER)
                .output(DOPED_GDSII_WAFER)
                .duration(400)
                .EUt(580)
                .buildAndRegister();

        MOCVD_UNIT_RECIPES.recipeBuilder()
                .input(THIN_COPPER_SHEET, 4)
                .input(DOPED_GDSII_WAFER)
                .output(CONNECTED_GDSII_WAFER)
                .duration(500)
                .EUt(480)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(foil, Copper)
                .output(THIN_COPPER_SHEET, 16)
                .duration(400)
                .EUt(580)
                .buildAndRegister();

        PLASMA_ETCHER_RECIPES.recipeBuilder()
                .fluidInputs(PiranhaSolution.getFluid(100))
                .input(CONNECTED_GDSII_WAFER)
                .output(ETCHED_GDSII_WAFER)
                .duration(500)
                .EUt(380)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .input(ETCHED_GDSII_WAFER)
                .output(GDSII_CHIP, 16)
                .duration(500)
                .EUt(380)
                .buildAndRegister();

        PACKER_RECIPES.recipeBuilder()
                .input(DIP_8_PACKAGE)
                .input(GDSII_CHIP)
                .output(DIP_8_MICROCONTROLLER)
                .duration(500)
                .EUt(380)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(frameGt, Lead)
                .input(bolt, Tin, 4)
                .fluidInputs(SolderingAlloy.getFluid(144))
                .output(DIP_8_PACKAGE, 16)
                .duration(300)
                .EUt(490)
                .buildAndRegister();
    }
}
