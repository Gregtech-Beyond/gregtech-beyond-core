package gtb.loaders.recipe.circuitry;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.common.item.GTBMetaItems.*;

import net.minecraft.item.ItemStack;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;

public class CrystalCircuitry {

    public static void init() {
        GTRecipeHandler.removeRecipesByInputs(LASER_ENGRAVER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(craftingLens, MarkerMaterials.Color.Lime),
                        ENGRAVED_CRYSTAL_CHIP.getStackForm() });

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(ENGRAVED_CRYSTAL_CHIP)
                .notConsumable(BIOLOGICALLY_APPROVED_LENS)
                .output(CRYSTAL_CENTRAL_PROCESSING_UNIT)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(Xerizin.getFluid(1000))
                .input(craftingLens, MarkerMaterials.Color.Black)
                .duration(200)
                .output(BIOLOGICALLY_APPROVED_LENS)
                .EUt(120)
                .buildAndRegister();
    }
}
