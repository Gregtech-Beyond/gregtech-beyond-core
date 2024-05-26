package gtb.api.unification.materials;

import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.info.MaterialIconSet;

public class GTBSecondDegreeMaterials {

    // Range: 25401 - 25500
    private static int startId = 25401;
    private static final int END_ID = startId + 100;

    public static void register() {
        RhodiumSulfateSolution = new Material.Builder(getMaterialsId(), gregtechId("rhodium_sulfate_solution"))
                .fluid()
                .color(0xC7C7C7)
                .build().setFormula("(RhSO4?)(H2O)", true);

        RutheniumTetroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("ruthenium_tetroxide_solution"))
                .fluid()
                .dust()
                .color(0xAAC0BC)
                .build().setFormula("(NaCl)2RuO4", true);

        AcidicIridiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("acidic_iridium_dioxide"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0xD4CAB0)
                .build().setFormula("(HCl)2(IrO2)2", true);

        PalladiumEnrichedAmmonia = new Material.Builder(getMaterialsId(), gregtechId("palladium_enriched_ammonia"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0x7B7C7C)
                .build().setFormula("Pd(NH3)?", true);

        ReprecipitatedPalladium = new Material.Builder(getMaterialsId(), gregtechId("reprecipitated_palladium"))
                .dust()
                .color(0xB1AC9E)
                .build().setFormula("Pd?(NH3)", true);

        Ethylenediamine = new Material.Builder(getMaterialsId(), gregtechId("ethylenediamine"))
                .dust()
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C2H4(NH2)2", true);

        Syngas = new Material.Builder(getMaterialsId(), gregtechId("syngas"))
                .fluid()
                .color(0xE8D6D1)
                .build().setFormula("(H)6(CO)", true);

        Pikyonium = new Material.Builder(getMaterialsId(), gregtechId("pikyonium"))
                .ingot()
                .build().setFormula("(Ni2NbAl2(Ni4Cr))8((Fe4(FeAlCr)(Fe2Ni05)10SSiC)5?4Ce3Sb2Pt2Yb(FeW)4", true);

        CalciumSalts = new Material.Builder(getMaterialsId(), gregtechId("calcium_salts"))
                .dust()
                .color(0xCBBB94)
                .build().setFormula("(CaO3)(CaS(H2O)2O4)", true);

        LithiumChlorideSolution = new Material.Builder(getMaterialsId(), gregtechId("lithium_chloride_solution"))
                .fluid()
                .color(0xc293e6)
                .build().setFormula("LiCl(H2O)", true);

        RoastedSphalerite = new Material.Builder(getMaterialsId(), gregtechId("roasted_sphalerite"))
                .dust()
                .color(0xAC8B5C)
                .flags(DISABLE_DECOMPOSITION)
                .iconSet(MaterialIconSet.FINE)
                .components(Gallium, 1, GermaniumDioxide, 1)
                .build();

        WaelzOxide = new Material.Builder(getMaterialsId(), gregtechId("waelz_oxide"))
                .dust()
                .color(0xB8B8B8)
                .flags(DISABLE_DECOMPOSITION)
                .iconSet(MaterialIconSet.FINE)
                .components(Zinc, 1, GermaniumDioxide, 1)
                .build();

        ImpureGermaniumDioxide = new Material.Builder(getMaterialsId(), gregtechId("impure_germanium_dioxide"))
                .dust()
                .color(0x666666)
                .flags(DISABLE_DECOMPOSITION)
                .iconSet(MaterialIconSet.ROUGH)
                .components(GermaniumDioxide, 1)
                .build().setFormula("GeO2?", true);

        ZincRichSphalerite = new Material.Builder(getMaterialsId(), gregtechId("zinc_rich_sphalerite"))
                .dust()
                .color(0xABA3A3)
                .iconSet(MaterialIconSet.METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Sphalerite, 1, Zinc, 2)
                .build();

        DilutedCeriumFiltrate = new Material.Builder(getMaterialsId(), gregtechId("diluted_cerium_filtrate"))
                .fluid()
                .color(0x406742).build().setFormula("Ce(H2O)?", true);
        DilutedAquaRegia = new Material.Builder(getMaterialsId(), gregtechId("diluted_aqua_regia"))
                .fluid()
                .color(0xB27743).build().setFormula("(HNO3)(HCl)2", true);

        DilutedCeriumSolution = new Material.Builder(getMaterialsId(), gregtechId("diluted_cerium_solution"))
                .fluid()
                .color(0x677753).build().setFormula("Ce?(H2O)2", true);

        AluminiumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("aluminium_hydroxide"))
                .dust()
                .color(0x2E325B).build().setFormula("Al(HO2)", true);

        WetHafniumZirconiumBlend = new Material.Builder(getMaterialsId(), gregtechId("wet_hafnium_zirconium_blend"))
                .dust()
                .color(0x645C5B).build().setFormula("(HfO2)(ZrO2)(H2O)?", true);

        HafniumZirconiumSlag = new Material.Builder(getMaterialsId(), gregtechId("hafnium_zirconium_blend"))
                .dust()
                .color(0x863F2A).build().setFormula("(HfO2)(ZrO2)?", true);

        RoastedHafniumZirconiumSlag = new Material.Builder(getMaterialsId(),
                gregtechId("roasted_hafnium_zirconium_slag"))
                .dust()
                .color(0x5D3017).build().setFormula("(HfO2)(ZrO2)", true);


        Rhodium_II_Acetate = new Material.Builder(getMaterialsId(), gregtechId("rhodium_ii_acetate"))
                .dust()
                .color(0xAB9E7F)
                .build().setFormula("Rh2(OOCCH3)4", true);

        HydrofluoricMethane = new Material.Builder(getMaterialsId(), gregtechId("hydrofluoric_methane"))
                .fluid()
                .color(0xB26F8C)
                .build().setFormula("HF(CH4)", true);

        Rhodium_III_Chloride = new Material.Builder(getMaterialsId(), gregtechId("rhodium_iii_chloride"))
                .dust()
                .color(0xD8AD41)
                .build().setFormula("Rh3(Cl2)", true);

        Dimethylsiloxane = new Material.Builder(getMaterialsId(), gregtechId("dimethylsiloxane"))
                .fluid()
                .color(0xB1ABAD)
                .build().setFormula("Si(CH3)2O", true);

        UrethanePrePolymer = new Material.Builder(getMaterialsId(), gregtechId("urethane_pre_polymer"))
                .fluid()
                .color(0xB0C5C8)
                .build().setFormula("Si(CH3)2O", true);

        TitaniumNitrate = new Material.Builder(getMaterialsId(), gregtechId("titanium_nitrate"))
                .dust()
                .color(0x7E24A3).build().setFormula("Ti(NO3)4", true);

        LithiumCarbonateSolution = new Material.Builder(getMaterialsId(), gregtechId("lithium_carbonate_solution"))
                .fluid()
                .color(0x2196F3).build().setFormula("Li2CO3(H2O)", true);

        LithiumPeroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("lithium_peroxide_solution"))
                .fluid()
                .color(0x81D4FA).build().setFormula("(H2O)Li2O2", true);

        OrthoXyleneZeoliteMixture = new Material.Builder(getMaterialsId(), gregtechId("ortho_xylene_zeolite_mixture"))
                .fluid()
                .color(0x636363).build().setFormula("(NaC4Si27Al9(H2O)28O72C6H4(CH3)2", true);

        ChlorodiisopropylPhosphine = new Material.Builder(getMaterialsId(), gregtechId("chlorodiisopropyl_phosphine"))
                .fluid()
                .color(0x26C6DA).build().setFormula("[(CH3)2CH]2PCl", true);

        CalcinatedSiliconDioxide = new Material.Builder(getMaterialsId(), gregtechId("calcinated_silicon_dioxide"))
                .dust()
                .color(0xCEABAB).build().setFormula("(SiO2)?", true);

        CalcinatedResidues = new Material.Builder(getMaterialsId(), gregtechId("calcinated_residues"))
                .dust()
                .fluid()
                .color(0x7A3926).build().setFormula("(SiO2)??", true);

        MuddyWater = new Material.Builder(getMaterialsId(), gregtechId("muddy_water"))
                .fluid()
                .color(0x6D4C41).build().setFormula("(H2O)?", true);

        DilutedCaesiumSolution = new Material.Builder(getMaterialsId(), gregtechId("diluted_caesium_solution"))
                .fluid()
                .flags(DISABLE_DECOMPOSITION)
                .color(0x302C2B)
                .build().setFormula("Cs(H2O)", true);

        DilutedRubidiumSolution = new Material.Builder(getMaterialsId(), gregtechId("diluted_rubidium_solution"))
                .fluid()
                .flags(DISABLE_DECOMPOSITION)
                .color(0xB71C1C)
                .build().setFormula("Rb(H2O)", true);

        MagnesiumChlorideSolution = new Material.Builder(getMaterialsId(), gregtechId("magnesium_chloride_solution"))
                .fluid()
                .flags(DISABLE_DECOMPOSITION)
                .color(0xBA68C8)
                .build().setFormula("(MgCl)(H2O)", true);

        StyreneButadieneSolution = new Material.Builder(getMaterialsId(), gregtechId("styrene_butadiene_solution"))
                .fluid()
                .color(0xCD846D)
                .build().setFormula("(C8H8)(C4H6)(C2H6O)", true);

        TriethylAluminium = new Material.Builder(getMaterialsId(),
                gregtechId("triethylaluminium"))
                .fluid()
                .color(0x4780B9)
                .build().setFormula("Al2(C2H5)6", true);

        TrimethylAluminium = new Material.Builder(getMaterialsId(),
                gregtechId("trimethylaluminium"))
                .fluid()
                .color(0x0097A7)
                .build().setFormula("Al(CH3)3", true);

        TriarylPhosphineSolution = new Material.Builder(getMaterialsId(), gregtechId("triaryl_phosphine_solution"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(H5C6)3P(H2O)?", true);

        HeavyAlkaliChlorideSolution = new Material.Builder(getMaterialsId(),
                gregtechId("heavy_alkali_chloride_solution"))
                .fluid()
                .color(0x8F5353)
                .build()
                .setFormula("RbCl(CsCl)2Cl3(H2O)2", true);

        TriarylPhosphine = new Material.Builder(getMaterialsId(), gregtechId("triaryl_phosphine"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(H5C6)3P", true);

        DiethylEther = new Material.Builder(getMaterialsId(), gregtechId("diethyl_ether"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(C2H5)2O", true);

        ArylmagnesiumHalides = new Material.Builder(getMaterialsId(), gregtechId("arylmagnesium_halides"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(C2H5)2O", true);

        KaminskyCatalyst = new Material.Builder(getMaterialsId(), gregtechId("kaminsky_catalyst"))
                .dust()
                .color(0x675952)
                .build().setFormula("(Zr(C5H5)2Cl2(AlCH3O)", true);

        PhilipsCatalyst = new Material.Builder(getMaterialsId(), gregtechId("philips_catalyst"))
                .dust()
                .color(0x6C73AD)
                .build().setFormula("(SiO2)(CrO3)", true);

        ZieglerNattaCatalyst = new Material.Builder(getMaterialsId(), gregtechId("ziegler_natta_catalyst"))
                .dust()
                .color(0x7A5D9F)
                .build().setFormula("Al2(C2H5)6)(TiCl4)", true);

        NitrogenizedCaprolactam = new Material.Builder(getMaterialsId(), gregtechId("nitrogenized_caprolactam"))
                .dust()
                .color(0x71777D)
                .build().setFormula("(CH2)5C(O)NH", true);

        ChromaticGlass = new Material.Builder(getMaterialsId(), gregtechId("chromatic_glass"))
                .gem()
                .dust()
                .color(0xBEA0D0)
                .build().setFormula("(SiO2)*", true);

        PhosphorusSolution = new Material.Builder(getMaterialsId(), gregtechId("phosphorus_solution"))
                .fluid()
                .color(0xFDD835)
                .build().setFormula("P(H2O)", true);

        Photopolymer = new Material.Builder(getMaterialsId(), gregtechId("photopolymer"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0xAFC896)
                .build().setFormula("P(H2O)", true);

        BioPlastic = new Material.Builder(getMaterialsId(), gregtechId("bio_plastic"))
                .fluid()
                .dust()
                .flags(MaterialFlags.GENERATE_PLATE)
                .color(0xAFC896)
                .build().setFormula("P(H2O)", true);

        DampBromine = new Material.Builder(getMaterialsId(), gregtechId("damp_bromine"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("Br(H2O)", true);

        Triphenylphosphine = new Material.Builder(getMaterialsId(), gregtechId("triphenylphosphine"))
                .fluid()
                .dust()
                .color(0x333537)
                .build().setFormula("(C6H5)3P", true);

        SodiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("sodium_hydroxide_solution"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("(H2O)NaOH", true);

        PhotopolymerSolution = new Material.Builder(getMaterialsId(), gregtechId("photopolymer_solution"))
                .fluid()
                .color(0x4DB6AC)
                .build().setFormula("C149H97N10O2(TiBF20)", true);

        UsedPhotopolymerSolution = new Material.Builder(getMaterialsId(), gregtechId("used_photopolymer_solution"))
                .fluid()
                .color(0xCE93D8)
                .build().setFormula("C149H97N10O2(TiBF20)?", true);

        GraphiteOxide = new Material.Builder(getMaterialsId(), gregtechId("graphite_oxide"))
                .dust()
                .color(0x707272)
                .build().setFormula("C(O2)", true);

        GrapheneOxide = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxide"))
                .dust()
                .color(0x5C5D5D)
                .build().setFormula("C(O2)", true);

        GrapheneOxidationResidues = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxidation_residues"))
                .dust()
                .color(0x827717)
                .build().setFormula("C(O2)", true);

        VeryHotAquaRegia = new Material.Builder(getMaterialsId(), gregtechId("very_hot_aqua_regia"))
                .fluid()
                .color(0xF9A825)
                .build().setFormula("(HNO3)(HCL)2", true);

        GrapheneOxidationSolution = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxidation_solution"))
                .fluid()
                .color(0xA29A56)
                .build().setFormula("C(O2)", true);

        CalciumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("calciumhydroxide"))
                .dust()
                .color(0x1A237E)
                .build().setFormula("Ca(OH)2", true);

        LithiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("lithiumhydroxidesolution"))
                .dust()
                .fluid()
                .color(0x0277BD)
                .build().setFormula("(H2O)LiOH", true);

        BastnasiteByProducts = new Material.Builder(getMaterialsId(), gregtechId("bastnasite_byproducts"))
                .dust()
                .color(0x895E47).build();

        SamaricRareEarthConcentrate = new Material.Builder(getMaterialsId(),
                gregtechId("samaric_rare_earth_concentrate"))
                .dust()
                .color(0xCFC182).build();

        DeoxygenationCatalyst = new Material.Builder(getMaterialsId(), gregtechId("deoxygenation_catalyst"))
                .dust()
                .color(0x858EC2).build();

        BastnasiteOxideComposite = new Material.Builder(getMaterialsId(), gregtechId("bastnasite_oxide_composite"))
                .dust()
                .color(0x937971).build();

        HydrogenationCatalyst = new Material.Builder(getMaterialsId(), gregtechId("hydrogenation_catalyst"))
                .dust()
                .color(0xB68AC1).build();

        NeodymiumRareEarthConcentrate = new Material.Builder(getMaterialsId(),
                gregtechId("neodymium_rare_earth_concentrate"))
                .dust()
                .color(0x686569).build().setFormula("NdO2???", true);







    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
