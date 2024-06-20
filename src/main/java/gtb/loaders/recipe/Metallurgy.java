package gtb.loaders.recipe;

import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
import static gtb.api.unification.materials.GTBMaterials.*;
import static gtb.api.unification.ore.GTBOrePrefix.*;
import static gtb.common.item.GTBMetaItems.*;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;

public final class Metallurgy {

    public static void init() {
        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(Rhodium.getFluid(144))
                .input(ingot, Palladium, 3)
                .output(ingot, RhodiumPlatedPalladium, 4)
                .duration(122)
                .EUt(24)
                .buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(FLUID_CELL)
                .output(COOLANT_CELL)
                .circuitMeta(1)
                .duration(1200)
                .EUt(8)
                .buildAndRegister();

        CANNER_RECIPES.recipeBuilder()
                .fluidInputs(SodiumPotassium.getFluid(1000))
                .input(COOLANT_CELL)
                .output(NAK_COOLANT_CELL)
                .duration(1200)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, TitaniumNitrate, 17)
                .input(dust, SodiumHydroxide, 6)
                .fluidInputs(LithiumCarbonateSolution.getFluid(1000))
                .output(ingot, LithiumTitanate, 6)
                .output(dust, SodaAsh, 6)
                .fluidOutputs(NitricAcid.getFluid(4000))
                .blastFurnaceTemp(1280)
                .EUt(800)
                .duration(70)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(CarbonMonoxide.getFluid(1000))
                .fluidInputs(LithiumPeroxideSolution.getFluid(1000))
                .fluidOutputs(LithiumCarbonateSolution.getFluid(2000))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenPeroxide.getFluid(1000))
                .fluidInputs(LithiumHydroxideSolution.getFluid(1000))
                .fluidOutputs(LithiumPeroxideSolution.getFluid(1000))
                .duration(800)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Oxygen.getFluid(2000))
                .fluidInputs(TitaniumTetrachloride.getFluid(1000))
                .fluidInputs(NitrogenPentoxide.getFluid(1000))
                .fluidOutputs(Chlorine.getFluid(4000))
                .output(dust, BariumTitanate, 17)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Cupronickel)
                .output(ingot, Cupronickel)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Cupronickel));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, SolderingAlloy)
                .output(ingot, SolderingAlloy)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, SolderingAlloy));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, FullerenePolymerTetrix)
                .output(ingot, FullerenePolymerTetrix)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, FullerenePolymerTetrix));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, FullerenePolymerMatrix)
                .output(ingot, FullerenePolymerMatrix)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, FullerenePolymerMatrix));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Zylon)
                .output(ingot, Zylon)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Zylon));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Polycaprolactam)
                .output(ingot, Polycaprolactam)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Polycaprolactam));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Polyethylene)
                .output(ingot, Polyethylene)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Polyethylene));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Polytetrafluoroethylene)
                .output(ingot, Polytetrafluoroethylene)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Polytetrafluoroethylene));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Polybenzimidazole)
                .output(ingot, Polybenzimidazole)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Polybenzimidazole));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Nomex)
                .output(ingot, Nomex)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Nomex));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Kevlar)
                .output(ingot, Kevlar)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Kevlar));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, KaptonE)
                .output(ingot, KaptonE)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, KaptonE));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, KaptonK)
                .output(ingot, KaptonK)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, KaptonK));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustImpure, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dustPure, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushed, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedCentrifuged, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(crushedPurified, Platinum));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(ore, Platinum));

        BLAST_RECIPES.recipeBuilder()
                .input(dust, Platinum)
                .output(ingot, Platinum)
                .blastFurnaceTemp(1600)
                .duration(200)
                .EUt(180)
                .buildAndRegister();

        ModHandler.addSmeltingRecipe(OreDictUnifier.get(dustImpure, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(dust, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(dustPure, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(crushed, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(crushedCentrifuged, Platinum),
                OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(crushedPurified, Platinum),
                OreDictUnifier.get(ingot, PlatinumRaw));
        ModHandler.addSmeltingRecipe(OreDictUnifier.get(ore, Platinum), OreDictUnifier.get(ingot, PlatinumRaw));

        MACERATOR_RECIPES.recipeBuilder()
                .input(ingot, PlatinumRaw)
                .output(ingot, PlatinumRaw)
                .EUt(12)
                .duration(80)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, BorosilicateGlass)
                .output(ingot, BorosilicateGlass)
                .EUt(2)
                .duration(200)
                .buildAndRegister();
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, BorosilicateGlass));

        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Cupronickel));
        ModHandler.removeFurnaceSmelting(OreDictUnifier.get(dust, Invar));

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Cupronickel)
                .output(ingot, Cupronickel)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Invar)
                .output(ingot, Invar)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .input(plate, Steel)
                .output(itemCasing, Steel, 2)
                .duration(400)
                .EUt(60)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Invar, 5)
                .input(dust, Iron, 4)
                .input(dust, Kanthal)
                .output(dust, EglinSteelBase, 10)
                .duration(600)
                .EUt(710)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .input(dust, Sulfur)
                .input(dust, Carbon)
                .input(dust, EglinSteelBase, 10)
                .input(dust, Silicon)
                .output(dust, EglinSteel, 13)
                .duration(500)
                .EUt(500)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(SiliconCarbide.getFluid(1000))
                .output(dust, PurifiedSiliconCarbide)
                .duration(200)
                .EUt(120)
                .buildAndRegister();
    }
}
