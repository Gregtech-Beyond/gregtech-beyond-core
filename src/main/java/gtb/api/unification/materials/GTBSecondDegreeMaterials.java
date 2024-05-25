package gtb.api.unification.materials;

import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
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

        UEVSuperconductor = new Material.Builder(getMaterialsId(), gregtechId("uev_superconductor"))
                .fluid()
                .dust()
                .color(0x29B6F6)
                .build().setFormula("?", true);

        Ethylenediamine = new Material.Builder(getMaterialsId(), gregtechId("ethylenediamine"))
                .dust()
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C2H4(NH2)2", true);

        ZBLAN = new Material.Builder(getMaterialsId(), gregtechId("zblan"))
                .fluid()
                .dust()
                .color(0xE0E1E1)
                .build().setFormula("?", true);

        Syngas = new Material.Builder(getMaterialsId(), gregtechId("syngas"))
                .fluid()
                .color(0xE8D6D1)
                .build().setFormula("(H)6(CO)", true);

        Pikyonium = new Material.Builder(getMaterialsId(), gregtechId("pikyonium"))
                .ingot()
                .build().setFormula("(Ni2NbAl2(Ni4Cr))8((Fe4(FeAlCr)(Fe2Ni05)10SSiC)5?4Ce3Sb2Pt2Yb(FeW)4", true);

        PotassiumMagnesiumSalts = new Material.Builder(getMaterialsId(), gregtechId("potassium_magnesium_salts"))
                .dust()
                .color(0xD7D6D6)
                .build().setFormula("KClMgSO4K2SO4KF", true);

        SodiumSalts = new Material.Builder(getMaterialsId(), gregtechId("sodium_salts"))
                .dust()
                .color(0x30345E)
                .build().setFormula("NaCl?", true);

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
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
