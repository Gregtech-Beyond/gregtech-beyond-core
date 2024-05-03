package gtb.api.unification.materials;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static gtb.api.unification.materials.GTBMaterials.*;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;

public class GTBFirstDegreeMaterials {

    private static int startId = 24001;
    private static final int END_ID = startId + 500;;

    public static void register() {
        PalladiumExtract = new Material.Builder(getMaterialsId(), gregtechId("palladium_extract"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build();

        PlatinumExtract = new Material.Builder(getMaterialsId(), gregtechId("platinum_extract"))
                .liquid(new FluidBuilder())
                .color(0xF1EED4)
                .build();

        PlatinumConcentrate = new Material.Builder(getMaterialsId(), gregtechId("platinum_concentrate"))
                .liquid(new FluidBuilder())
                .color(0xDBD49B)
                .build();

        PlatinumResidues = new Material.Builder(getMaterialsId(), gregtechId("platinum_residues"))
                .dust()
                .color(0xC2BFA7)
                .build().setFormula("Ir2??", true);

        PotassiumDisulfate = new Material.Builder(getMaterialsId(), gregtechId("potassium_disulfate"))
                .dust()
                .color(0xD84315)
                .components(Potassium, 2, Sulfur, 2, Oxygen, 7)
                .build();

        LeachResidue = new Material.Builder(getMaterialsId(), gregtechId("leach_residues"))
                .dust()
                .color(0x8D8333)
                .build().setFormula("Ir2??", true);

        SodiumRuthenate = new Material.Builder(getMaterialsId(), gregtechId("sodium_ruthenate"))
                .dust()
                .color(0x9DA1C7)
                .build().setFormula("Na2O4Ru", true);

        RutheniumTetroxideLiquid = new Material.Builder(getMaterialsId(), gregtechId("ruthenium_tetroxide_liquid"))
                .liquid(new FluidBuilder())
                .color(0x5C6BC0)
                .build().setFormula("RuO4", true);

        IridiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("iridium_dioxide"))
                .dust()
                .color(0xEA8B56)
                .build().setFormula("IrO2", true);

        PlatinumSolution = new Material.Builder(getMaterialsId(), gregtechId("platinum_solution"))
                .liquid(new FluidBuilder())
                .color(0xFAF3BD)
                .build().setFormula("Pt??", true);

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

        Nonene = new Material.Builder(getMaterialsId(), gregtechId("nonene"))
                .liquid(new FluidBuilder())
                .color(0xAF91B7)
                .build().setFormula("C9H18", true);

        Propylene = new Material.Builder(getMaterialsId(), gregtechId("propylene"))
                .liquid(new FluidBuilder())
                .color(0xE2DFC7)
                .build().setFormula("C3H6", true);

        Hexane = new Material.Builder(getMaterialsId(), gregtechId("hexane"))
                .liquid(new FluidBuilder())
                .color(0xBD89A5)
                .build().setFormula("C3H6", true);

        Pentane = new Material.Builder(getMaterialsId(), gregtechId("pentane"))
                .liquid(new FluidBuilder())
                .color(0xE9C6C6)
                .build().setFormula("C3H6", true);

        NHexadecane = new Material.Builder(getMaterialsId(), gregtechId("nhexadecane"))
                .liquid(new FluidBuilder())
                .color(0x8F8F8F)
                .build().setFormula("C16H34", true);

        NOctane = new Material.Builder(getMaterialsId(), gregtechId("noctane"))
                .liquid(new FluidBuilder())
                .color(0xE57373)
                .build().setFormula("C8H18", true);

        NHeptane = new Material.Builder(getMaterialsId(), gregtechId("nheptane"))
                .liquid(new FluidBuilder())
                .color(0xD57777)
                .build().setFormula("C7H16", true);

        ZSM5 = new Material.Builder(getMaterialsId(), gregtechId("zsm_5"))
                .dust()
                .liquid(new FluidBuilder())
                .color(0x7D967F)
                .build().setFormula("C7H16", true);

        MXylene = new Material.Builder(getMaterialsId(), gregtechId("mxylene"))
                .liquid(new FluidBuilder())
                .color(0x353535)
                .build().setFormula("C8H10", true);

        OXylene = new Material.Builder(getMaterialsId(), gregtechId("oxylene"))
                .liquid(new FluidBuilder())
                .color(0x353535)
                .build().setFormula("C8H10", true);

        PXylene = new Material.Builder(getMaterialsId(), gregtechId("pxylene"))
                .liquid(new FluidBuilder())
                .color(0x353535)
                .build().setFormula("C8H10", true);

        MPXylene = new Material.Builder(getMaterialsId(), gregtechId("opxylene"))
                .liquid(new FluidBuilder())
                .color(0x353535)
                .build().setFormula("C8H10", true);

        NPropanol = new Material.Builder(getMaterialsId(), gregtechId("npropanol"))
                .fluid()
                .color(0xF8EC7F)
                .build().setFormula("CH10O", true);

        NButanol = new Material.Builder(getMaterialsId(), gregtechId("nbutanol"))
                .liquid(new FluidBuilder())
                .color(0xC87A7A)
                .build().setFormula("CH10O", true);

        IsoamylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("isoamyl_alcohol"))
                .liquid(new FluidBuilder())
                .color(0xC87A7A)
                .build().setFormula("C5H12O", true);

        IsobutylAlcohol = new Material.Builder(getMaterialsId(), gregtechId("isobutyl_alcohol"))
                .liquid(new FluidBuilder())
                .color(0xAB47BC)
                .build().setFormula("C5H12O", true);

        Formaldehyde = new Material.Builder(getMaterialsId(), gregtechId("formaldehyde"))
                .liquid(new FluidBuilder())
                .color(0xAB47BC)
                .build().setFormula("CH20", true);

        Dicyclopentadiene = new Material.Builder(getMaterialsId(), gregtechId("dicyclopentadiene"))
                .liquid(new FluidBuilder())
                .color(0xAB47BC)
                .build().setFormula("C10H12", true);

        Cyclopentadiene = new Material.Builder(getMaterialsId(), gregtechId("cyclopentadiene"))
                .liquid(new FluidBuilder())
                .color(0xAB47BC)
                .build().setFormula("C5H6", true);

        TungstenTrioxide = new Material.Builder(getMaterialsId(), gregtechId("tungstentrioxide"))
                .dust()
                .color(0x6E9C46)
                .build().setFormula("WO3", true);

        HydrogenPeroxide = new Material.Builder(getMaterialsId(), gregtechId("hydrogenperoxide"))
                .liquid(new FluidBuilder())
                .color(0xC2E2F0)
                .build().setFormula("H2O2", true);

        CalciumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("calciumhydroxide"))
                .dust()
                .color(0x9FC0A1)
                .build().setFormula("Ca(OH)2", true);

        LithiumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("lithiumhydroxide"))
                .dust()
                .color(0x1A4051)
                .build().setFormula("LiOH", true);

        SodiumTungstate = new Material.Builder(getMaterialsId(), gregtechId("sodiumtungstate"))
                .liquid(new FluidBuilder())
                .color(0x606262)
                .build().setFormula("Na2WO4", true);

        CalciumTungstate = new Material.Builder(getMaterialsId(), gregtechId("calciumtungstate"))
                .dust()
                .color(0x909393)
                .build().setFormula("WCaO4", true);

        LithiumHydroxideSolution = new Material.Builder(getMaterialsId(), gregtechId("lithiumhydroxidesolution"))
                .liquid(new FluidBuilder())
                .color(0x1A4051)
                .build().setFormula("(H2O)LiOH", true);

        LithiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("lithiumfluoride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("LiF3", true);

        Polyetheretherketone = new Material.Builder(getMaterialsId(), gregtechId("polyetheretherketone"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("C20H12O3", true);

        Cuproquin = new Material.Builder(getMaterialsId(), gregtechId("cuproquin"))
                .dust()
                .color(0x191919)
                .build().setFormula("C18H13CuN2O", true);
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
