package gtb.loaders.recipe.handlers.ore_processing;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.recipes.GTRecipeHandler;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;

import gtb.common.item.GTBMetaItems;
import net.minecraft.item.ItemStack;

public class AntimonyProcessing {
    
    public static void init(){



        GTRecipeHandler.removeRecipesByInputs(CENTRIFUGE_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, Stibnite, 5) });

        GTRecipeHandler.removeRecipesByInputs(ELECTROLYZER_RECIPES,
                new ItemStack[] {
                        OreDictUnifier.get(dust, AntimonyTrioxide, 5) });

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Stibnite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Stibnite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Stibnite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Stibnite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Stibnite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Stibnite));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Stibnite));


        ROASTER_RECIPES.recipeBuilder()
                .input(dust, AntimonyTrioxide, 5)
                .output(dust, Antimony, 2)
                .circuitMeta(1)
                .fluidOutputs(Steam.getFluid(3000))
                .duration(200)
                .EUt(20)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .input(dust, AntimonyTrioxide, 5)
                .output(dust, Antimony, 2)
                .circuitMeta(0)
                .duration(200)
                .EUt(20)
                .buildAndRegister();
        
        
        
        

    }
}
