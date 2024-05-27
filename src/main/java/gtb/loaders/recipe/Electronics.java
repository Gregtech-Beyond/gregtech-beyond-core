package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.common.item.GTBMetaItems.*;

public class Electronics {

    public static void init() {
        ASSEMBLER_RECIPES.recipeBuilder()
                .input(plate, Polybenzimidazole)
                .input(ELECTRIC_MOTOR_HV)
                .input(dye, DyeOrange)
                .input(stick, Steel, 4)
                .output(ROTARRY_SPINNING_WHISKER)
                .duration(2000)
                .EUt(700)
                .buildAndRegister();
    }
}
