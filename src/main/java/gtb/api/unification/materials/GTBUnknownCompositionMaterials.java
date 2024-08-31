package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.FluidState;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.unification.material.Material;

import gregtech.api.unification.material.Materials;
import gtb.api.unification.materials.info.GTBMaterialFlags;
import net.minecraft.util.text.TextFormatting;

public class GTBUnknownCompositionMaterials {

    // Range 25201-25400
    private static int startId = 21200;
    private static final int END_ID = startId + 1000;

    public static void register() {
        NaquadahWaste = new Material.Builder(getMaterialsId(),
                gregtechId("naquadah_waste"))
                        .fluid()
                        .color(0x2d690b).build();

        RareNaquadahWaste = new Material.Builder(getMaterialsId(),
                gregtechId("rare_naquadah_waste"))
                        .fluid()
                        .color(0x0c2100).build();
        //  25201 BZMedium
        BZMedium = new Material.Builder(getMaterialsId(), gregtechId("bz_medium"))
                .fluid()
                .color(10681653)
                .build();
        //  25202 EDP
        EDP = new Material.Builder(getMaterialsId(), gregtechId("edp"))
                .fluid()
                .color(16514839)
                .build();
        //  25203 Rich Nitrogen Mixture
        RichNitrogenMixture = new Material.Builder(getMaterialsId(), gregtechId("rich_nitrogen_mixture"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x6891D8)
                .build();
        //  25204 Rich Ammonia Mixture
        RichAmmoniaMixture = new Material.Builder(getMaterialsId(), gregtechId("rich_ammonia_mixture"))
                .fluid()
                .color(0x708ACD)
                .build();
        //  25205 Blazing Pyrotheum
        BlazingPyrotheum = new Material.Builder(getMaterialsId(), gregtechId("blazing_pyrotheum"))
                .liquid(new FluidBuilder().temperature(8000))
                .color(Materials.Blaze.getMaterialRGB())
                .components(Blaze, 2, Redstone, 1, Sulfur, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  25206 Gelid Cryotheum
        GelidCryotheum = new Material.Builder(getMaterialsId(), gregtechId("gelid_cryotheum"))
                .liquid(new FluidBuilder().temperature(8))
                .color(0x40B8FB)
                .components(Ice, 2, Electrotine, 1, Water, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  25207 Co/AC-AB Catalyst
        CoACABCatalyst = new Material.Builder(getMaterialsId(), gregtechId("co_ac_ab_catalyst"))
                .dust()
                .color(0x6B4312)
                .iconSet(METALLIC)
                .build();
        //  25208 PhosphoreneSolution
        PhosphoreneSolution = new Material.Builder(getMaterialsId(), gregtechId("phosphorene_solution"))
                .fluid()
                .color(0x465966)
                .build();
        //  25209 Methylamine Mixture
        MethylamineMixture = new Material.Builder(getMaterialsId(), gregtechId("methylamine_mixture"))
                .fluid()
                .color(0xAA4400)
                .build();
        //  25210 Molybdenum Flue
        MolybdenumFlue = new Material.Builder(getMaterialsId(), gregtechId("molybdenum_flue"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x39194A)
                .build();
        //  25211 Trace Rhenium Flue
        TraceRheniumFlue = new Material.Builder(getMaterialsId(), gregtechId("trace_rhenium_flue"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x96D6D5)
                .build();
        //  25212 Chalcogen Anode Mud
        ChalcogenAnodeMud = new Material.Builder(getMaterialsId(), gregtechId("chalcogen_anode_mud"))
                .dust()
                .color(0x8A3324)
                .iconSet(FINE)
                .build();
        //  25213 Precious Metal
        PreciousMetal = new Material.Builder(getMaterialsId(), gregtechId("precious_metal"))
                .ore(1, 1, false)
                .ingot()
                .addOreByproducts(Iron)
                .color(0xDAA520)
                .iconSet(SHINY)
                .build()
                .setFormula("Au?", false);
        //  25214 Iridium Platinum Metal Dust
        IridiumPlatinumMetalDust = new Material.Builder(getMaterialsId(), gregtechId("iridium_platinum_metal_dust"))
                .dust()
                .color(0x87CEFA)
                .iconSet(ROUGH)
                .build()
                .setFormula("Ir2O4(SiO2)2Au3Pt?", true);
        //  25215 Rarest Metal Residue
        RarestMetalResidue = new Material.Builder(getMaterialsId(), gregtechId("rarest_metal_residue"))
                .dust()
                .color(0xA0522D)
                .iconSet(DULL)
                .build();
        //  25216 Crude Naquadah Fuel
        CrudeNaquadahFuel = new Material.Builder(getMaterialsId(), gregtechId("crude_naquadah_fuel"))
                .fluid()
                .color(0x077F4E)
                .iconSet(DULL)
                .build();
        //  25217 Heavy Naquadah Fuel
        HeavyNaquadahFuel = new Material.Builder(getMaterialsId(), gregtechId("heavy_naquadah_fuel"))
                .fluid()
                .color(0x088C56)
                .build();
        //  25218 Medium Naquadah Fuel
        MediumNaquadahFuel = new Material.Builder(getMaterialsId(), gregtechId("medium_naquadah_fuel"))
                .fluid()
                .color(0x09A566)
                .build();
        //  25219 Light Naquadah Fuel
        LightNaquadahFuel = new Material.Builder(getMaterialsId(), gregtechId("light_naquadah_fuel"))
                .fluid()
                .color(0x0BBF75)
                .build();
        //  25220 Naquadah Gas
        NaquadahGas = new Material.Builder(getMaterialsId(), gregtechId("naquadah_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS).translation("gregtech.fluid.gas_generic"))
                .color(0x0CD985)
                //.iconSet(GAS)
                .build();
        //  25221 Fracturing Fluid
        FracturingFluid = new Material.Builder(getMaterialsId(), gregtechId("fracturing_fluid"))
                .fluid()
                .color(0x96D6D5)
                .build();
        //  25222 Bedrock
        Bedrock = new Material.Builder(getMaterialsId(), gregtechId("bedrock"))
                .dust()
                .fluid()
                .color(0x404040)
                .iconSet(ROUGH)
                .build();
        //  25223 Bedrock Smoke
        BedrockSmoke = new Material.Builder(getMaterialsId(), gregtechId("bedrock_smoke"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x525252)
                .build();
        //  25224 Bedrock Soot Solution
        BedrockSootSolution = new Material.Builder(getMaterialsId(), gregtechId("bedrock_soot_solution"))
                .fluid()
                .color(0x1E2430)
                .build();
        //  25225 Clean Bedrock Solution
        CleanBedrockSolution = new Material.Builder(getMaterialsId(), gregtechId("clean_bedrock_solution"))
                .fluid()
                .color(0xA89F9E)
                .build();
        //  25226 Heavy Bedrock Smoke
        HeavyBedrockSmoke = new Material.Builder(getMaterialsId(), gregtechId("heavy_bedrock_smoke"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x242222)
                .build();
        //  25227 Medium Bedrock Smoke
        MediumBedrockSmoke = new Material.Builder(getMaterialsId(), gregtechId("medium_bedrock_smoke"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x2E2C2C)
                .build();
        //  25228 Light Bedrock Smoke
        LightBedrockSmoke = new Material.Builder(getMaterialsId(), gregtechId("light_bedrock_smoke"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x363333)
                .build();
        //  25229 Ultralight Bedrock Smoke
        UltralightBedrockSmoke = new Material.Builder(getMaterialsId(), gregtechId("ultralight_bedrock_smoke"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x403D3D)
                .build();
        //  25230 Heavy Taranium Gas
        HeavyTaraniumGas = new Material.Builder(getMaterialsId(), gregtechId("heavy_taranium_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x262626)
                .build();
        //  25231 Medium Taranium Gas
        MediumTaraniumGas = new Material.Builder(getMaterialsId(), gregtechId("medium_taranium_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x313131)
                .build();
        //  25232 Light Taranium Gas
        LightTaraniumGas = new Material.Builder(getMaterialsId(), gregtechId("light_taranium_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x404040)
                .build();
        //  25233 Bedrock Gas
        BedrockGas = new Material.Builder(getMaterialsId(), gregtechId("bedrock_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x575757)
                .build();
        //  25234 Cracked Heavy Taranium
        CrackedHeavyTaranium = new Material.Builder(getMaterialsId(), gregtechId("cracked_heavy_taranium"))
                .fluid()
                .color(0x1F2B2E)
                .build();
        //  25235 Cracked Medium Taranium
        CrackedMediumTaranium = new Material.Builder(getMaterialsId(), gregtechId("cracked_medium_taranium"))
                .fluid()
                .color(0x29393D)
                .build();
        //  25236 Cracked Light Taranium
        CrackedLightTaranium = new Material.Builder(getMaterialsId(), gregtechId("cracked_light_taranium"))
                .fluid()
                .color(0x374C52)
                .build();
        //  25237 Enriched Bedrock Soot Solution
        EnrichedBedrockSootSolution = new Material.Builder(getMaterialsId(), gregtechId("enriched_bedrock_soot_solution"))
                .fluid()
                .color(0x280C26)
                .build();
        //  25238 Clean Enriched Bedrock Solution
        CleanEnrichedBedrockSolution = new Material.Builder(getMaterialsId(), gregtechId("clean_enriched_bedrock_solution"))
                .fluid()
                .color(0x828C8C)
                .build();
        //  25239 Heavy Enriched Bedrock Smoke
        HeavyEnrichedBedrockSmoke = new Material.Builder(getMaterialsId(), gregtechId("heavy_enriched_bedrock_smoke"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x1A2222)
                .build();
        //  25240 Medium Enriched Bedrock Smoke
        MediumEnrichedBedrockSmoke = new Material.Builder(getMaterialsId(), gregtechId("medium_enriched_bedrock_smoke"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x1E2C2C)
                .build();
        //  25241 Light Enriched Bedrock Smoke
        LightEnrichedBedrockSmoke = new Material.Builder(getMaterialsId(), gregtechId("light_enriched_bedrock_smoke"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x163333)
                .build();
        //  25242 Heavy Enriched Taranium Gas
        HeavyEnrichedTaraniumGas = new Material.Builder(getMaterialsId(), gregtechId("heavy_enriched_taranium_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x1F2626)
                .build();
        //  25243 Medium Enriched Taranium Gas
        MediumEnrichedTaraniumGas = new Material.Builder(getMaterialsId(), gregtechId("medium_enriched_taranium_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x1F3131)
                .build();
        //  25244 Light Enriched Taranium Gas
        LightEnrichedTaraniumGas = new Material.Builder(getMaterialsId(), gregtechId("light_enriched_taranium_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0x1F4040)
                .build();
        //  25245 Cracked Heavy Enriched Taranium
        CrackedHeavyEnrichedTaranium = new Material.Builder(getMaterialsId(), gregtechId("cracked_heavy_enriched_taranium"))
                .fluid()
                .color(0x2E1F2E)
                .build();
        //  25246 Cracked Medium Enriched Taranium
        CrackedMediumEnrichedTaranium = new Material.Builder(getMaterialsId(), gregtechId("cracked_medium_enriched_taranium"))
                .fluid()
                .color(0x29393D)
                .build();
        //  25247 Cracked Light Enriched Taranium
        CrackedLightEnrichedTaranium = new Material.Builder(getMaterialsId(), gregtechId("cracked_light_enriched_taranium"))
                .fluid()
                .color(0x374C52)
                .build();
        //  25248 Energetic Naquadria
        EnergeticNaquadria = new Material.Builder(getMaterialsId(), gregtechId("energetic_naquadria"))
                .fluid()
                .color(0x202020)
                .build();
        //  25249 Light Hyper Fuel
        LightHyperFuel = new Material.Builder(getMaterialsId(), gregtechId("light_hyper_fuel"))
                .fluid()
                .color(0x8C148C)
                .build();
        //  25250 Medium Hyper Fuel
        MediumHyperFuel = new Material.Builder(getMaterialsId(), gregtechId("medium_hyper_fuel"))
                .fluid()
                .color(0xDC0A0A)
                .build();
        //  25251 Heavy Hyper Fuel
        HeavyHyperFuel = new Material.Builder(getMaterialsId(), gregtechId("heavy_hyper_fuel"))
                .fluid()
                .color(0x1E5064)
                .build();
        //  25252 Crude Rare Earth Turbid Solution
        CrudeRareEarthTurbidSolution = new Material.Builder(getMaterialsId(), gregtechId("crude_rare_earth_turbid_solution"))
                .fluid()
                .color(0x9C5C6B)
                .iconSet(DULL)
                .build();
        //  25253 Nitrated Rare Earth Turbid Solution
        NitratedRareEarthTurbidSolution = new Material.Builder(getMaterialsId(), gregtechId("nitrated_rare_earth_turbid_solution"))
                .fluid()
                .color(0x754550)
                .iconSet(DULL)
                .build();
        //  25254 Rare Earth Hydroxides Solution
        RareEarthHydroxidesSolution = new Material.Builder(getMaterialsId(), gregtechId("rare_earth_hydroxides_solution"))
                .fluid()
                .color(0x434327)
                .flags(DISABLE_DECOMPOSITION)
                .components(RareEarth, 1, Oxygen, 1, Hydrogen, 1, Water, 1)
                .build();
        //  25255 Rare Earth Chlorides Slurry
        RareEarthChloridesSlurry = new Material.Builder(getMaterialsId(), gregtechId("rare_earth_chlorides_slurry"))
                .dust()
                .color(0x838367)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(RareEarth, 1, Chlorine, 1, Water, 1)
                .build();
        //  25256 Low-purity Rare Earth Chlorides Solution
        LowPurityRareEarthChloridesSolution = new Material.Builder(getMaterialsId(), gregtechId("low_purity_rare_earth_chlorides_solution"))
                .fluid()
                .color(0x838333)
                .iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(RareEarth, 1, Chlorine, 1, Water, 2)
                .build();
        //  25257 Roughly Purified Rare Earth Chlorides Solution
        RoughlyPurifiedRareEarthChloridesSolution = new Material.Builder(getMaterialsId(), gregtechId("roughly_purified_rare_earth_chlorides_solution"))
                .fluid()
                .color(0xA2A27F)
                .iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(LowPurityRareEarthChloridesSolution, 4, AquaRegia, 2)
                .build();
        //  25258 High Purity Rare Earth Chlorides Slurry
        HighPurityRareEarthChloridesSlurry = new Material.Builder(getMaterialsId(), gregtechId("high_purity_rare_earth_chlorides_slurry"))
                .dust()
                .color(0x838367)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(RareEarth, 1, Chlorine, 1, Water, 1)
                .build();
        //  25259 High Purity Rare Earth Chlorides Solution
        HighPurityRareEarthChloridesSolution = new Material.Builder(getMaterialsId(), gregtechId("high_purity_rare_earth_chlorides_solution"))
                .fluid()
                .color(0x838367)
                .flags(DISABLE_DECOMPOSITION)
                .components(RareEarth, 1, Chlorine, 1, Water, 1)
                .build();
        //  25260 Low Purity Rare Earth Chlorides Slag
        LowPurityRareEarthChloridesSlag = new Material.Builder(getMaterialsId(), gregtechId("low_purity_rare_earth_chlorides_slag"))
                .dust()
                .color(0x62624D)
                .iconSet(DULL)
                .build();
        //  25261 La-Pr-Nd-Ce Oxides Solution
        LaPrNdCeOxidesSolution = new Material.Builder(getMaterialsId(), gregtechId("la_pr_nd_ce_oxides_solution"))
                .fluid()
                .color(0x9CE3DB)
                .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(LanthanumOxide, 1, PraseodymiumOxide, 1, NeodymiumOxide, 1, CeriumOxide, 1)
                .build();
        //  25262 Sc-Eu-Gd-Sm Oxides Solution
        ScEuGdSmOxidesSolution = new Material.Builder(getMaterialsId(), gregtechId("sc_eu_gd_sm_oxides_solution"))
                .fluid()
                .color(0xFFFF99)
                .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(ScandiumOxide, 1, EuropiumOxide, 1, GadoliniumOxide, 1, SamariumOxide, 1)
                .build();
        //  25263 Y-Tb-Dy-Ho Oxides Solution
        YTbDyHoOxidesSolution = new Material.Builder(getMaterialsId(), gregtechId("y_tb_dy_ho_oxides_solution"))
                .fluid()
                .color(0x99FF99)
                .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(YttriumOxide, 1, TerbiumOxide, 1, DysprosiumOxide, 1, HolmiumOxide, 1)
                .build();
        //  25264 Er-Tm-Yb-Lu Oxides Solution
        ErTmYbLuOxidesSolution = new Material.Builder(getMaterialsId(), gregtechId("er_tm_yb_lu_oxides_solution"))
                .fluid()
                .color(0xFFB3FF)
                .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(ErbiumOxide, 1, ThuliumOxide, 1, YtterbiumOxide, 1, LutetiumOxide, 1)
                .build();
        //  25265 Chlorinated Solvents
        ChlorinatedSolvents = new Material.Builder(getMaterialsId(), gregtechId("chlorinated_solvents"))
                .fluid()
                .color(0x40804c)
                .build()
                .setFormula("(CH4)2Cl5", true);
        //  25266 Superheated Steam
        SuperheatedSteam = new Material.Builder(getMaterialsId(), gregtechId("superheated_steam"))
                .liquid(new FluidBuilder().customStill().state(FluidState.GAS).temperature(573))
                .color(0xC4C4C4)
                .flags(DISABLE_DECOMPOSITION)
                .components(Hydrogen, 2, Oxygen, 1)
                .build();
        //  25267 Supercritical Steam
        SupercriticalSteam = new Material.Builder(getMaterialsId(), gregtechId("supercritical_steam"))
                .liquid(new FluidBuilder().customStill().state(FluidState.GAS).temperature(873))
                .color(0xC4C4C4)
                .flags(DISABLE_DECOMPOSITION)
                .components(Hydrogen, 2, Oxygen, 1)
                .build();
        // 25268 High-Temperature Exhaust Gas
        HighTemperatureExhaustGas = new Material.Builder(getMaterialsId(), gregtechId("high_temperature_exhaust_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS).temperature(1123))
                .color(0xF0EAD6)
                .build();
        // 25269 Exhaust Gas
        ExhaustGas = new Material.Builder(getMaterialsId(), gregtechId("exhaust_gas"))
                .liquid(new FluidBuilder().state(FluidState.GAS).temperature(298))
                .color(0xEDEADE)
                .build();
        //  25270 Nitrated Dragon Dust Solution
        NitratedDragonDustSolution = new Material.Builder(getMaterialsId(), gregtechId("nitrated_dragon_dust_solution"))
                .liquid(new FluidBuilder().attributes(FluidAttributes.ACID))
                .color(0xF553FF)
                .build();
        //  25271 Residual Draconium Solution
        ResidualDraconiumSolution = new Material.Builder(getMaterialsId(), gregtechId("residual_draconium_solution"))
                .fluid()
                .color(0x4321C5)
                .build();
        //  25272 Draconium Slag Solution
        DraconiumSlagSolution = new Material.Builder(getMaterialsId(), gregtechId("draconium_slag_solution"))
                .fluid()
                .color(0x790D80)
                .iconSet(DULL)
                .build()
                .setFormula("Dc?(H2O)", true);
        //  25273 Actinium Radium Hydroxide Solution
        ActiniumRadiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("actinium_radium_hydroxide_solution"))
                .fluid()
                .color(Actinium.getMaterialRGB() + Radium.getMaterialRGB())
                .build();
        //  25274 Actinium Radium Nitrate Solution
        ActiniumRadiumNitrateSolution = new Material.Builder(getMaterialsId(), gregtechId("actinium_radium_nitrate_solution"))
                .fluid()
                .color(ActiniumRadiumHydroxideSolution.getMaterialRGB() + NitricAcid.getMaterialRGB())
                .build();
        //  25275 Heavy Fluorinated Draconium Solution
        HeavyFluorinatedDraconiumSolution = new Material.Builder(getMaterialsId(), gregtechId("heavy_fluorinated_draconium_solution"))
                .fluid()
                .color(0x8C117D)
                .build();
        //  25276 Quasi-fissioning Plasma
        QuasifissioningPlasma = new Material.Builder(getMaterialsId(), gregtechId("quasi_fissioning_plasma"))
                .liquid(new FluidBuilder().state(FluidState.PLASMA).temperature(230490))
                .color(0xB0A2C3)
                .build()
                .setFormula(TextFormatting.OBFUSCATED + "aaa", false);

        NaqHydrochloricAcid = new Material.Builder(getMaterialsId(),
                gregtechId("naq_hydrochloric_acid"))
                        .fluid()
                        .color(0x1d4f00).build();

        RareNaqFluoroantimonicAcid = new Material.Builder(getMaterialsId(),
                gregtechId("rare_naq_fluoroantimonic_acid"))
                        .fluid()
                        .color(0xa1c9a5).build();

        // 25201 Platinum Extraction Mixture
        PlatinumExtractionMixture = new Material.Builder(getMaterialsId(), gregtechId("platinum_extraction_mixture"))
                .liquid(new FluidBuilder())
                .color(0x009688)
                .build();

        PalladiumMotherLiqour = new Material.Builder(getMaterialsId(), gregtechId("palladium_mother_liqour"))
                .liquid(new FluidBuilder())
                .color(0x6B7271)
                .build().setFormula("(NH4Cl)2(ZnCl)2(HCl4)(H2O)16", true);

        DilutedOil = new Material.Builder(getMaterialsId(), gregtechId("diluted_oil"))
                .liquid(new FluidBuilder())
                .color(0x141414)
                .build();

        DesaltedOil = new Material.Builder(getMaterialsId(), gregtechId("desalted_oil"))
                .liquid(new FluidBuilder())
                .color(0x2C2C2C)
                .build();

        SulfuricDiesel = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_diesel"))
                .liquid(new FluidBuilder())
                .color(0xA19355)
                .build();

        SulfuricGasoline = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_gasoline"))
                .liquid(new FluidBuilder())
                .color(0xA8A374)
                .build();

        SulfuricKerosene = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        SulfuricOilResidues = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_oil_residues"))
                .liquid(new FluidBuilder())
                .color(0x827717)
                .build();

        Kerosene = new Material.Builder(getMaterialsId(), gregtechId("kerosene"))
                .liquid(new FluidBuilder())
                .color(0xAB47BC)
                .build();

        SulfuricFuelOil = new Material.Builder(getMaterialsId(), gregtechId("sulfuric_fuel_oil"))
                .liquid(new FluidBuilder())
                .color(0xFFB546)
                .build();

        FuelOil = new Material.Builder(getMaterialsId(), gregtechId("fuel_oil"))
                .liquid(new FluidBuilder())
                .color(0x827717)
                .build();

        SteamCrackedKerosene = new Material.Builder(getMaterialsId(), gregtechId("steam_cracked_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        HydroCrackedKerosene = new Material.Builder(getMaterialsId(), gregtechId("hydro_cracked_kerosene"))
                .liquid(new FluidBuilder())
                .color(0xB89E61)
                .build();

        Furfural = new Material.Builder(getMaterialsId(), gregtechId("furfural"))
                .liquid(new FluidBuilder())
                .color(0x3949AB)
                .build().setFormula("C5H4O2", true);

        BTEX = new Material.Builder(getMaterialsId(), gregtechId("btex"))
                .liquid(new FluidBuilder())
                .color(0x605C35)
                .build();

        EthanolWaterAzeotrope = new Material.Builder(getMaterialsId(), gregtechId("ethanol_water_azeotrope"))
                .liquid(new FluidBuilder())
                .color(0xD88267)
                .build().setFormula("(C2H6O)91(H2O)9", true);

        FuselOil = new Material.Builder(getMaterialsId(), gregtechId("fusel_oil"))
                .liquid(new FluidBuilder())
                .color(0xa62403)
                .build();

        ImpureEthanol = new Material.Builder(getMaterialsId(), gregtechId("impure_ethanol"))
                .liquid(new FluidBuilder())
                .color(0x6F6936)
                .build();

        GrainSolution = new Material.Builder(getMaterialsId(), gregtechId("grain_solution"))
                .liquid(new FluidBuilder())
                .color(0xCDCDC8)
                .build();

        Vinegar = new Material.Builder(getMaterialsId(), gregtechId("vinegar"))
                .liquid(new FluidBuilder())
                .color(0xc3c4b3)
                .build();

        FractionC_5 = new Material.Builder(getMaterialsId(), gregtechId("fraction_c_5"))
                .liquid(new FluidBuilder())
                .color(0xc3c4b3)
                .build();

        LubricantMixture = new Material.Builder(getMaterialsId(), gregtechId("lubricant_mixture"))
                .liquid(new FluidBuilder())
                .color(0x837D4A)
                .build();

        SlackWax = new Material.Builder(getMaterialsId(), gregtechId("slack_wax"))
                .liquid(new FluidBuilder())
                .color(0xFBC02D)
                .build();

        AlkylatedNaturalGas = new Material.Builder(getMaterialsId(), gregtechId("alkylated_natural_gas"))
                .liquid(new FluidBuilder())
                .color(0xFBC02D)
                .build();

        Syngas = new Material.Builder(getMaterialsId(), gregtechId("syngas"))
                .liquid(new FluidBuilder())
                .color(0xE8D6D1)
                .build();

        NovolacsPhotoresist = new Material.Builder(getMaterialsId(), gregtechId("novolacs_photoresist"))
                .fluid()
                .color(0xAF877B)
                .build();

        IodizedOil = new Material.Builder(getMaterialsId(), gregtechId("iodized_oil"))
                .fluid()
                .color(0x41403C)
                .build().setFormula("I?", true);

        Brine = new Material.Builder(getMaterialsId(), gregtechId("brine"))
                .fluid()
                .color(0xFDE785)
                .build().setFormula("I??", true);

        CrudeBromineSolution = new Material.Builder(getMaterialsId(), gregtechId("crude_bromine_solution"))
                .fluid()
                .color(0xD29898)
                .build().setFormula("I??", true);

        ConcentratedBrine = new Material.Builder(getMaterialsId(), gregtechId("concentrated_brine"))
                .fluid()
                .color(0xDBCF99)
                .build().setFormula("Br?", true);

        Brine = new Material.Builder(getMaterialsId(), gregtechId("brine"))
                .fluid()
                .color(0xa88539)
                .build().setFormula("?", true);

        CrudeBromineSolution = new Material.Builder(getMaterialsId(), gregtechId("crude_bromine_solution"))
                .fluid()
                .color(0xeb5a21)
                .build().setFormula("H2SO4Br(H2O)Cl", true);

        ConcentratedBrine = new Material.Builder(getMaterialsId(), gregtechId("concentrated_brine"))
                .fluid()
                .color(0xebc221)
                .build().setFormula("?", true);

        BedrockContaminatedOil = new Material.Builder(getMaterialsId(), gregtechId("bedrock_contaminated_oil"))
                .fluid()
                .color(0x888D83)
                .build();

        Perfluorotributylamine = new Material.Builder(getMaterialsId(), gregtechId("perfluorotributylamine"))
                .fluid()
                .color(0x80638B)
                .build();

        BedrockSlurry = new Material.Builder(getMaterialsId(), gregtechId("bedrock_slurry"))
                .fluid()
                .color(0x383739)
                .build();

        PurifiedBedrockSlurry = new Material.Builder(getMaterialsId(), gregtechId("purified_bedrock_slurry"))
                .fluid()
                .color(0x2D2B2E)
                .build();

        AdamantaneRichOilSolution = new Material.Builder(getMaterialsId(), gregtechId("adamantane_rich_oil_solution"))
                .fluid()
                .color(0x516B95)
                .build();

        LiquidOzone = new Material.Builder(getMaterialsId(), gregtechId("liquid_ozone"))
                .fluid()
                .color(0x0288D1)
                .build();

        TriniumSolution = new Material.Builder(getMaterialsId(), gregtechId("trinium_solution"))
                .fluid()
                .color(0xB8BCBE)
                .build();

        AdamantiumPentoxide = new Material.Builder(getMaterialsId(), gregtechId("adamantiun_pentoxide"))
                .fluid()
                .dust()
                .color(0x04273B)
                .build();

        AdamantiumPhosphorusHydrogenPlasma = new Material.Builder(getMaterialsId(),
                gregtechId("admantium_phosphorus_hydrogen_plasma"))
                        .plasma()
                        .color(0x1B4F6B)
                        .build();

        GaseousAdamantane = new Material.Builder(getMaterialsId(), gregtechId("gaseous_adamantane"))
                .fluid()
                .color(0x5C7786)
                .build();

        MoltenAdamantiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("molten_adamantium_dioxide"))
                .fluid()
                .color(0x0F374C)
                .build();

        MithrilFluoride = new Material.Builder(getMaterialsId(), gregtechId("mithril_fluoride"))
                .fluid()
                .color(0x0F5A83)
                .build();

        AdamantaneLubricant = new Material.Builder(getMaterialsId(), gregtechId("adamantane_lubricant"))
                .fluid()
                .color(0xB3AC87)
                .build();

        IodizedOil = new Material.Builder(getMaterialsId(), gregtechId("iodized_oil"))
                .fluid()
                .color(0x32312F)
                .build();

        WetBedrockDust = new Material.Builder(getMaterialsId(), gregtechId("wet_bedrock_dust"))
                .dust()
                .color(0x121212)
                .build();

        OilyBedrockDust = new Material.Builder(getMaterialsId(), gregtechId("oily_bedrock_dust"))
                .dust()
                .color(0x7A7D7F)
                .build();

        FineBedrockDust = new Material.Builder(getMaterialsId(), gregtechId("fine_bedrock_dust"))
                .dust()
                .color(0x010101)
                .build();

        EnrichedNaquadahNitrate = new Material.Builder(getMaterialsId(), gregtechId("enriched_naquadah_nitrate"))
                .dust()
                .color(0x212121)
                .build();

        NaquadriaNitrate = new Material.Builder(getMaterialsId(), gregtechId("naquadria_nitrate"))
                .dust()
                .color(0x1C1C1E)
                .build();

        PrecipitateMithril = new Material.Builder(getMaterialsId(), gregtechId("precipitate_mithril"))
                .dust()
                .color(0x0277BD)
                .build();

        RoughenMithril = new Material.Builder(getMaterialsId(), gregtechId("roughen_mithril"))
                .dust()
                .color(0x7DAAC4)
                .build();

        ExcitedRoughenMithril = new Material.Builder(getMaterialsId(), gregtechId("excited_roughen_mithril"))
                .dust()
                .color(0x667F8E)
                .build();

        ExcitedMithril = new Material.Builder(getMaterialsId(), gregtechId("excited_mithril"))
                .dust()
                .color(0x75AACA)
                .build();

        GrainsOfInfinity = new Material.Builder(getMaterialsId(), gregtechId("grains_of_infinity"))
                .dust()
                .color(0x292B2C)
                .build();

        CrudeZinc = new Material.Builder(getMaterialsId(), gregtechId("crude_zinc"))
                .fluid()
                .color(0xF3F3F3)
                .build();

        CadmiumRichZinc = new Material.Builder(getMaterialsId(), gregtechId("cadmium_rich_zinc"))
                .fluid()
                .color(0x7A787B)
                .build();

        BlueVitriol = new Material.Builder(getMaterialsId(), gregtechId("blue_vitriol"))
                .fluid()
                .color(0x1565C0)
                .build();

        ColdAir = new Material.Builder(getMaterialsId(), gregtechId("cold_air"))
                .fluid()
                .color(0xBBDEFB)
                .build();

        SupercooledLiquidNitrogen = new Material.Builder(getMaterialsId(), gregtechId("supercooled_liquid_nitrogen"))
                .fluid()
                .color(0x4FC3F7)
                .build();

        UntreatedLiquidOxygen = new Material.Builder(getMaterialsId(), gregtechId("untreated_liquid_oxygen"))
                .fluid()
                .color(0x6CA4BE)
                .build();

        ColdWasteGasouesNitrogen = new Material.Builder(getMaterialsId(), gregtechId("cold_waste_gaseous_nitrogen"))
                .fluid()
                .color(0x5C7884)
                .build();

        ColdGasouesNitrogen = new Material.Builder(getMaterialsId(), gregtechId("cold_gaseous_nitrogen"))
                .fluid()
                .color(0x5C7884)
                .build();

        ArgonRichGas = new Material.Builder(getMaterialsId(), gregtechId("argon_rich_gas"))
                .fluid()
                .color(0x6B976D)
                .build();

        CrudeArgonVapor = new Material.Builder(getMaterialsId(), gregtechId("crude_argon_vapor"))
                .fluid()
                .color(0x388E3C)
                .build();

        SupercooledOxygen = new Material.Builder(getMaterialsId(), gregtechId("supercooled_oxygen"))
                .fluid()
                .color(0x32312F)
                .build();

        LiquidWasteNitrogen = new Material.Builder(getMaterialsId(), gregtechId("liquid_waste_nitrogen"))
                .fluid()
                .color(0x29B6F6)
                .build();

        RareGasRichGaseousNitrogen = new Material.Builder(getMaterialsId(),
                gregtechId("rare_gas_rich_gaseous_nitrogen"))
                        .fluid()
                        .color(0x7E57C2)
                        .build();

        RareGasMixture = new Material.Builder(getMaterialsId(), gregtechId("rare_gas_mixture"))
                .fluid()
                .color(0x8F78B6)
                .build();

        LiquidKrypton = new Material.Builder(getMaterialsId(), gregtechId("liquid_krypton"))
                .fluid()
                .color(0x0277BD)
                .build();

        NitrogenStrippedRareGasMixture = new Material.Builder(getMaterialsId(),
                gregtechId("nitrogen_stripped_rare_gas_mixture"))
                        .fluid()
                        .color(0x7B1FA2)
                        .build();

        CrudeKrypton = new Material.Builder(getMaterialsId(), gregtechId("crude_krypton"))
                .fluid()
                .color(0x81C784)
                .build();

        UEVSuperconductor = new Material.Builder(getMaterialsId(), gregtechId("uev_superconductor"))
                .fluid()
                .dust()
                .color(0x29B6F6)
                .build().setFormula("?", true);

        ZBLAN = new Material.Builder(getMaterialsId(), gregtechId("zblan"))
                .fluid()
                .dust()
                .color(0xE0E1E1)
                .build().setFormula("?", true);

        PlatinumSolution = new Material.Builder(getMaterialsId(), gregtechId("platinum_solution"))
                .fluid()
                .color(0xFAF3BD)
                .build().setFormula("Pt??", true);

        PalladiumExtract = new Material.Builder(getMaterialsId(), gregtechId("palladium_extract"))
                .fluid()
                .color(0xEF5350)
                .build();

        PlatinumExtract = new Material.Builder(getMaterialsId(), gregtechId("platinum_extract"))
                .fluid()
                .color(0xF1EED4)
                .build();

        PlatinumConcentrate = new Material.Builder(getMaterialsId(), gregtechId("platinum_concentrate"))
                .fluid()
                .color(0xDBD49B)
                .build();

        PlatinumResidues = new Material.Builder(getMaterialsId(), gregtechId("platinum_residues"))
                .dust()
                .color(0xC2BFA7)
                .build().setFormula("Ir2??", true);

        PlatinumSalt = new Material.Builder(getMaterialsId(), gregtechId("platinum_salt"))
                .dust()
                .color(0xFAF3BD)
                .build().setFormula("Pt?", true);

        PalladiumSalt = new Material.Builder(getMaterialsId(), gregtechId("palladium_salt"))
                .dust()
                .color(0xB4B4B4)
                .build().setFormula("Pd?", true);

        PalladiumMetallicPowder = new Material.Builder(getMaterialsId(), gregtechId("palladium_metallic_powder"))
                .dust()
                .color(0x616161)
                .build().setFormula("Pd?", true);

        CrudeNeon = new Material.Builder(getMaterialsId(), gregtechId("crude_neon"))
                .fluid()
                .color(0xF9A825)
                .build();

        LiquidCrystalDetector = new Material.Builder(getMaterialsId(), gregtechId("liquid_crystal_detector"))
                .fluid()
                .color(0x9C27B0)
                .build().setFormula("?", true);

        CrudeHelium = new Material.Builder(getMaterialsId(), gregtechId("crude_helium"))
                .fluid()
                .color(0xDCE775)
                .build();

        CrudeXenon = new Material.Builder(getMaterialsId(), gregtechId("crude_xenon"))
                .fluid()
                .color(0xD32F2F)
                .build();

        CrudeArgon = new Material.Builder(getMaterialsId(), gregtechId("crude_argon"))
                .fluid()
                .color(0x9CCC65)
                .build();

        PartiallyLiquidKrypton = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_krypton"))
                .fluid()
                .color(0x81C784)
                .build();

        PartiallyLiquidNeon = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_neon"))
                .fluid()
                .color(0xF9A825)
                .build();

        PartiallyLiquidHelium = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_helium"))
                .fluid()
                .color(0xDCE775)
                .build();

        PartiallyLiquidXenon = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_xenon"))
                .fluid()
                .color(0xD32F2F)
                .build();

        PartiallyLiquidArgon = new Material.Builder(getMaterialsId(), gregtechId("partially_liquid_argon"))
                .fluid()
                .color(0x9CCC65)
                .build();

        LiquidArgon = new Material.Builder(getMaterialsId(), gregtechId("liquid_argon"))
                .fluid()
                .color(0x689F38)
                .build();

        LiquidNeon = new Material.Builder(getMaterialsId(), gregtechId("liquid_neon"))
                .fluid()
                .color(0xFF8F00)
                .build();

        ColdGaseousOxygen = new Material.Builder(getMaterialsId(), gregtechId("cold_gaseous_oxygen"))
                .fluid()
                .color(0xFF8F00)
                .build();

        LiquidOxygen = new Material.Builder(getMaterialsId(), gregtechId("liquid_oxygen"))
                .fluid()
                .color(0x2196F3)
                .build();

        DarmstadtiumCatalyst = new Material.Builder(getMaterialsId(), gregtechId("darmstadtium_catalyst"))
                .dust()
                .color(0x333537)
                .build().setFormula("?", true);

        SaltFreeBrine = new Material.Builder(getMaterialsId(), gregtechId("salt_free_brine"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("?", true);

        BoronFreeSolution = new Material.Builder(getMaterialsId(), gregtechId("boron_free_solution"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("?", true);

        AlkylatedAdamantanes = new Material.Builder(getMaterialsId(), gregtechId("alkylated_adamantanes"))
                .fluid()
                .color(0x3949AB)
                .build().setFormula("C10H16(?)", true);

        PolybenzimidazolePrePolymerFoam = new Material.Builder(getMaterialsId(),
                gregtechId("polybenzimidazole_pre_polymer_foam"))
                        .dust()
                        .color(0x2B2B2B)
                        .build().setFormula("?", true);

        ImpurePolybenzimidazoleSolution = new Material.Builder(getMaterialsId(),
                gregtechId("impure_polybenzimidazole_solution"))
                        .fluid()
                        .color(0x353637)
                        .build().setFormula("?", true);

        PolybenzimidazoleSolution = new Material.Builder(getMaterialsId(), gregtechId("polybenzimidazole_solution"))
                .fluid()
                .color(0x232425)
                .build().setFormula("?", true);

        PolybenzimidazoleWaste = new Material.Builder(getMaterialsId(), gregtechId("polybenzimidazole_waste"))
                .fluid()
                .color(0x565453)
                .build().setFormula("?", true);

        PhenyleneSulfidePrePolymerMixture = new Material.Builder(getMaterialsId(),
                gregtechId("phenylene_sulfide_pre_polymer_mixture"))
                        .fluid()
                        .color(0x565453)
                        .build().setFormula("?", true);

        PlatinumMetallicPowder = new Material.Builder(getMaterialsId(),
                gregtechId("platinum_metallic_powder"))
                        .dust()
                        .color(0xFAD28F)
                        .build().setFormula("Pt?", true);

        CrudeRhodiumMetal = new Material.Builder(getMaterialsId(), gregtechId("crude_rhodium_metal"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        RhodiumSalt = new Material.Builder(getMaterialsId(), gregtechId("rhodium_salt"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        RhodiumSaltSolution = new Material.Builder(getMaterialsId(), gregtechId("rhodium_salt_solution"))
                .fluid()
                .color(0xFAD28F)
                .build().setFormula("Rh?", true);

        CalcinatedBastnasite = new Material.Builder(getMaterialsId(), gregtechId("calcinated_bastnasite"))
                .dust()
                .color(0x944C36).build().setFormula("?", true);

        DehydrogenationCatalyst = new Material.Builder(getMaterialsId(), gregtechId("dehydragenation_catalyst"))
                .dust()
                .color(0xFFB74D).build().setFormula("?", true);

        RhodiumFilterCake = new Material.Builder(getMaterialsId(), gregtechId("rhodium_filter_cake"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("?", true);

        RhodiumFilterCakeSolution = new Material.Builder(getMaterialsId(), gregtechId("rhodium_filter_cake_solution"))
                .fluid()
                .color(0xFAD28F)
                .build().setFormula("?", true);

        SamariumRareEarthConcentrate = new Material.Builder(getMaterialsId(),
                gregtechId("samarium_rare_earth_concentrate"))
                        .dust()
                        .color(0xC4C3BB).build().setFormula("SmO?", true);

        BastnasiteConcentrate = new Material.Builder(getMaterialsId(), gregtechId("bastnasite_concentrate"))
                .fluid()
                .color(0xD38973).build();

        CeriumRichBastnasiteConcentrate = new Material.Builder(getMaterialsId(),
                gregtechId("cerium_rich_bastnasite_concentrate"))
                        .fluid()
                        .color(0x6D2712).build();

        AcidicBastnasiteConcentrate = new Material.Builder(getMaterialsId(),
                gregtechId("acidic_bastnasite_concentrate"))
                        .fluid()
                        .color(0xAF662E).build();

        AcidicCeriumBasedMud = new Material.Builder(getMaterialsId(), gregtechId("acidic_cerium_based_mud"))
                .fluid()
                .color(0x984A0F).build().setFormula("Ce?", true);

        BastnasiteRarerEarthOxidesMixture = new Material.Builder(getMaterialsId(),
                gregtechId("bastnasite_rarer_earth_oxides_mixture"))
                        .fluid()
                        .color(0x826D67).build();

        DriedBastnasiteRarerEarthOxidesPulp = new Material.Builder(getMaterialsId(),
                gregtechId("dried_bastnasite_rarer_earth_oxides_pulp"))
                        .fluid()
                        .color(0x4E1B0C).build();

        BastnasiteRarerEarthOxidesEmulsion = new Material.Builder(getMaterialsId(),
                gregtechId("bastnasite_rarer_earth_oxides_emulsion"))
                        .fluid()
                        .color(0x8E6254).build();

        BastnasiteRarerEarthOxidesSolution = new Material.Builder(getMaterialsId(),
                gregtechId("bastnasite_rarer_earth_oxides_solution"))
                        .fluid()
                        .color(0x66210C).build();

        SamariumReducedRarerEarthOxides = new Material.Builder(getMaterialsId(),
                gregtechId("samarium_reduced_rarer_earth_oxides"))
                        .fluid()
                        .color(0x623324).build();

        CeriumSolution = new Material.Builder(getMaterialsId(), gregtechId("cerium_solution"))
                .fluid()
                .color(0xABB59E).build().setFormula("Ce?", true);

        DriedMonaziteFiltrate = new Material.Builder(getMaterialsId(), gregtechId("dried_monazite_filtrate"))
                .dust()
                .color(0x677753).build();

        CeriumOxideFiltrate = new Material.Builder(getMaterialsId(), gregtechId("cerium_oxide_filtrate"))
                .dust()
                .color(0x689F38).build().setFormula("CeO2?", true);

        ThoriumConcentrate = new Material.Builder(getMaterialsId(), gregtechId("thorium_concentrate"))
                .dust()
                .color(0x354D21).build().setFormula("ThU?", true);

        RareEarthFiltrate = new Material.Builder(getMaterialsId(), gregtechId("rare_earth_filtrate"))
                .dust()
                .color(0x6C6C6B).build().setFormula("REE?", true);

        ChlorinatedMonaziteFiltrate = new Material.Builder(getMaterialsId(),
                gregtechId("chlorinated_monazite_filtrate"))
                        .dust()
                        .color(0x345727).build().setFormula("?", true);

        SaturatedChlorinatedMonaziteFiltrate = new Material.Builder(getMaterialsId(),
                gregtechId("saturated_chlorinated_monazite_filtrate"))
                        .dust()
                        .color(0x00695C).build().setFormula("?", true);

        MonaziteSulfide = new Material.Builder(getMaterialsId(), gregtechId("monazite_sulfide"))
                .dust()
                .color(0x2A3426).build().setFormula("?", true);

        ThoriumPhosphateCake = new Material.Builder(getMaterialsId(), gregtechId("thorium_phoshpate_cake"))
                .dust()
                .color(0x1B5E20).build().setFormula("?", true);

        UraniumFiltrate = new Material.Builder(getMaterialsId(), gregtechId("uranium_filtrate"))
                .dust()
                .color(0x1D4E20).build().setFormula("U?", true);

        ZieglerAlfolMixture = new Material.Builder(getMaterialsId(), gregtechId("ziegler_alfol_mixture"))
                .fluid()
                .color(0x424C5A).build().setFormula("?", true);

        MonaziteOreByproductSlurry = new Material.Builder(getMaterialsId(), gregtechId("monazite_ore_byproduct_slurry"))
                .fluid()
                .color(0x436436).build().setFormula("??", true);

        ImpureMonaziteOreByproductSlurry = new Material.Builder(getMaterialsId(),
                gregtechId("impure_monazite_ore_byproduct_slurry"))
                        .fluid()
                        .color(0x33691E).build().setFormula("?2", true);

        MuddyMonaziteOreByproducts = new Material.Builder(getMaterialsId(), gregtechId("muddy_monazite_ore_byproducts"))
                .dust()
                .color(0x5C423A).build().setFormula("???", true);

        CeriumOxideFiltrate = new Material.Builder(getMaterialsId(), gregtechId("cerium_oxide_filtrate"))
                .fluid()
                .color(0x43A047).build().setFormula("CeO2?", true);

        CooledRareEarthFiltrate = new Material.Builder(getMaterialsId(), gregtechId("cooled_rare_earth_filtrate"))
                .fluid()
                .color(0x936E62).build().setFormula("??", true);

        NeutralizedRareEarthFiltrate = new Material.Builder(getMaterialsId(),
                gregtechId("neutralized_rare_earth_filtrate"))
                        .fluid()
                        .color(0x7F5E54).build().setFormula("?", true);

        MonaziteSulfide = new Material.Builder(getMaterialsId(), gregtechId("monazite_sulfide"))
                .fluid()
                .color(0x009688).build().setFormula("??", true);

        RareEarthFiltrate = new Material.Builder(getMaterialsId(), gregtechId("rare_earth_filtrate"))
                .fluid()
                .color(0x6B524B).build().setFormula("???", true);

        DilutedMonaziteSulfide = new Material.Builder(getMaterialsId(), gregtechId("diluted_monazite_sulfide"))
                .fluid()
                .color(0x388E3C).build().setFormula("??", true);

        MonaziteSolution = new Material.Builder(getMaterialsId(), gregtechId("monazite_solution"))
                .fluid()
                .color(0x388E3C).build().setFormula("?", true);

        MuddyMonaziteSolution = new Material.Builder(getMaterialsId(), gregtechId("muddy_monazite_solution"))
                .fluid()
                .color(0x652A18).build().setFormula("??", true);

        SodiumSalts = new Material.Builder(getMaterialsId(), gregtechId("sodium_salts"))
                .dust()
                .color(0x30345E)
                .build().setFormula("NaCl?", true);

        NaquadriaticCompound = new Material.Builder(getMaterialsId(), gregtechId("naquadriatic_compound"))
                .dust()
                .color(0x333537)
                .build().setFormula("*Nq*?", true);

        EnrichedNaquadahCompound = new Material.Builder(getMaterialsId(), gregtechId("enriched_naquadah_compound"))
                .dust()
                .color(0x333537)
                .build().setFormula("Nq+?", true);

        LeachResidue = new Material.Builder(getMaterialsId(), gregtechId("leach_residues"))
                .dust()
                .color(0x8D8333)
                .build().setFormula("Ir2??", true);

        NaquadahRichSterileGrowthMedium = new Material.Builder(getMaterialsId(),
                gregtechId("naquadah_rich_sterile_growth_medium"))
                        .fluid()
                        .color(0x272529)
                        .build();

        MuddyBastnasiteSolution = new Material.Builder(getMaterialsId(), gregtechId("muddy_bastnasite_solution"))
                .fluid()
                .color(0x926F64).build();

        ConditionedBastnasiteMud = new Material.Builder(getMaterialsId(), gregtechId("conditioned_bastnasite_mud"))
                .fluid()
                .color(0x5B210F).build();

        DilutedBastnasiteMud = new Material.Builder(getMaterialsId(), gregtechId("diluted_bastnasite_mud"))
                .fluid()
                .color(0x973314).build();

        FilteredBastnasiteMud = new Material.Builder(getMaterialsId(), gregtechId("filtered_bastnasite_mud"))
                .fluid()
                .color(0xAB7564).build();

        MonaziteRarerEarthFiltrate = new Material.Builder(getMaterialsId(), gregtechId("monazite_rarer_earth_filtrate"))
                .dust()
                .color(0x758A6C).build();

        AmidoEthylAlkylImidazole = new Material.Builder(getMaterialsId(), gregtechId("amido_ethyl_alkyl_imidazole"))
                .fluid()
                .color(0x442A62).build();

        PolymerizedStyreneButadieneSolution = new Material.Builder(getMaterialsId(),
                gregtechId("polymerized_styrene_butadiene_solution"))
                        .fluid()
                        .color(0x454545)
                        .build();

        DinitrobenzeneMixture = new Material.Builder(getMaterialsId(), gregtechId("dinitrobenzene_mixture"))
                .dust()
                .color(0x599B5D).build();

        NomexPolymerizationBase = new Material.Builder(getMaterialsId(), gregtechId("nomex_polymerization_base"))
                .fluid()
                .color(0x791BFF).build();

        PolymerizationReadyZylon = new Material.Builder(getMaterialsId(), gregtechId("polymerization_ready_zylon"))
                .dust()
                .color(0xD2A842).build();

        RarerEarthConcentrate = new Material.Builder(getMaterialsId(), gregtechId("rarer_earth_concentrate"))
                .fluid()
                .color(0x593F37).build();

        OxidizedOrthoXyleneMixture = new Material.Builder(getMaterialsId(), gregtechId("oxidized_ortho_xylene_mixture"))
                .fluid()
                .color(0x555555).build();

        CooledOrthoXyleneMixture = new Material.Builder(getMaterialsId(), gregtechId("cooled_ortho_xylene_mixture"))
                .fluid()
                .color(0x4C4C4C).build();

        Rhodocrosite = new Material.Builder(getMaterialsId(), gregtechId("rhodocrosite"))
                .dust()
                .color(0xC62828).build().setFormula("MnCO3", true);

        CassiteriteCokePellets = new Material.Builder(getMaterialsId(), gregtechId("cassiterite_coke_pellets"))
                .dust()
                .color(0x414040).build().setFormula("SnO2C?", true);

        TinSlag = new Material.Builder(getMaterialsId(), gregtechId("tin_slag"))
                .dust()
                .color(0xADAAAA).build().setFormula("NbTa?", true);

        NbTaContainingDust = new Material.Builder(getMaterialsId(), gregtechId("nb_ta_containing_dust"))
                .dust()
                .color(0x8E7C7C).build().setFormula("NbTa?", true);

        NiobiumTantalumOxide = new Material.Builder(getMaterialsId(), gregtechId("niobium_tantalum_dust"))
                .dust()
                .color(0xC66262).build().setFormula("(Nb2O5)(Ta2O5)", true);

        AluminiumTrifluoride = new Material.Builder(getMaterialsId(), gregtechId("aluminium_trifluoride"))
                .dust()
                .color(0x1976D2).build().setFormula("AlF3", true);

        SiliconFluoride = new Material.Builder(getMaterialsId(), gregtechId("silicon_fluoride"))
                .fluid()
                .color(0x818A91).build().setFormula("SiF2", true);

        NbTaFluorideMix = new Material.Builder(getMaterialsId(), gregtechId("nb_ta_fluoride_mix"))
                .fluid()
                .color(0x786158).build().setFormula("(H2NbOF5)(H2TaF7)", true);

        BariumOxide = new Material.Builder(getMaterialsId(), gregtechId("barium_oxide"))
                .dust()
                .color(0xC86B69).build().setFormula("BaO2", true);

        BariumPeroxide = new Material.Builder(getMaterialsId(), gregtechId("barium_peroxide"))
                .dust()
                .color(0x9C3734).build().setFormula("BaO5", true);

        Columbite = new Material.Builder(getMaterialsId(), gregtechId("columbite"))
                .dust()
                .ore()
                .flags(GTBMaterialFlags.GENERATE_FLOATED, GTBMaterialFlags.GENERATE_SIFTED)
                .color(0xFDD835).build().setFormula("FeNb2O6", true);

        Celestine = new Material.Builder(getMaterialsId(), gregtechId("celestine"))
                .dust()
                .ore()
                .flags(GTBMaterialFlags.GENERATE_FLOATED, GTBMaterialFlags.GENERATE_SIFTED)
                .color(0xA7CFF1).build().setFormula("SrSO4", true);

        FusedColumbite = new Material.Builder(getMaterialsId(), gregtechId("fused_columbite"))
                .dust()
                .color(0xB3A460).build().setFormula("(Fe2O3)(NaO)Nb2O5", true);

        ColumbiteMinorOxideResidue = new Material.Builder(getMaterialsId(), gregtechId("columbite_minor_oxide_residue"))
                .dust()
                .color(0x8B7B33).build().setFormula("(BaO)(SnO2)(WO3)(Al2O3)", true);

        LeachedColumbite = new Material.Builder(getMaterialsId(), gregtechId("leached_columbite"))
                .dust()
                .color(0x9E925E).build().setFormula("(Nb2O5)9Ta2O5?", true);

        IronSulfate = new Material.Builder(getMaterialsId(), gregtechId("iron_sulfate"))
                .dust()
                .color(0xFFF176).build().setFormula("FeSO4", true);

        SodiumSulfate = new Material.Builder(getMaterialsId(), gregtechId("sodium_sulfate"))
                .dust()
                .color(0x2A6E8D).build().setFormula("Na2SO4", true);

        TantaliteMinorOxideResidue = new Material.Builder(getMaterialsId(), gregtechId("tantalite_minor_oxide_residue"))
                .dust()
                .color(0xFDD835).build().setFormula("(BaO)(ZrO2)(TiO2)(SiO2)", true);

        FusedTantalite = new Material.Builder(getMaterialsId(), gregtechId("fused_tantalite"))
                .dust()
                .color(0x57382F).build().setFormula("(Fe2O3)(NaO)Ta2O5", true);

        LeachedTantalite = new Material.Builder(getMaterialsId(), gregtechId("leached_tantalite"))
                .dust()
                .color(0x5A200E).build().setFormula("(Ta2O5)9Nb2O5?", true);

        AcidicLeachedPyrochlore = new Material.Builder(getMaterialsId(), gregtechId("acidic_leached_pyrochlore"))
                .dust()
                .color(0x8F4630).build().setFormula("(H2SO4)Ca12Sr6Ba6?ThUNb26O78F26", true);

        LeachedPyrochlore = new Material.Builder(getMaterialsId(), gregtechId("leached_pyrochlore"))
                .dust()
                .color(0x8F4630).build().setFormula("(Nb2O5)9Ta2O5?", true);

        PotasssiumFluoroNiobate = new Material.Builder(getMaterialsId(), gregtechId("potassium_fluoro_niobate"))
                .dust()
                .color(0x72FF86).build().setFormula("K2NbF7", true);

        FluorotantalicAcid = new Material.Builder(getMaterialsId(), gregtechId("fluorotantalic_acid"))
                .fluid()
                .color(0x7CB342).build().setFormula("TaHF7", true);

        NbTaSeparationMixture = new Material.Builder(getMaterialsId(), gregtechId("nb_ta_separation_mixture"))
                .fluid()
                .color(0xFFA078).build().setFormula("C18H39O5P", true);

        OxypentafluoroNiobate = new Material.Builder(getMaterialsId(), gregtechId("oxypentafluoro_niobate"))
                .fluid()
                .color(0x70FF5E).build().setFormula("H2NbOF5", true);

        HeptafluoroTantalate = new Material.Builder(getMaterialsId(), gregtechId("heptafluoro_tantalite"))
                .fluid()
                .color(0x2AFF5E).build().setFormula("H2TaF7", true);

        PotasssiumFluoroTantalate = new Material.Builder(getMaterialsId(), gregtechId("potassium_fluoro_tantalite"))
                .dust()
                .color(0x00DC51).build().setFormula("K2TaF7", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
