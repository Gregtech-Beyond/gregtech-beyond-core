package gtb.common.item;

import gregtech.api.items.metaitem.StandardMetaItem;

public class GTBMetaItemRegistry extends StandardMetaItem {

    public GTBMetaItemRegistry(short i) {
        super(i);
    }

    @Override
    public void registerSubItems() {
        GTBMetaItems.ASTRO_MINER = addItem(1, "astro_miner");
        GTBMetaItems.MOON = addItem(2, "moon");
        GTBMetaItems.PARAFFIN_WAX = addItem(3, "paraffin_wax");
        GTBMetaItems.NANO_CPU_WAFER = addItem(5, "nano_cpu_wafer");
        GTBMetaItems.TRENCHED_SUPERCONDUCTOR_LAYERED_UHASOC_WAFER = addItem(6,
                "trenched_superconductor_layered_uhasoc_wafer");
        GTBMetaItems.MONOCRYSTALLINE_SEED_CRYSTAL = addItem(7, "monocrystalline_seed_crystal");
        GTBMetaItems.POLYSILICON_WAFER = addItem(8, "polysilicon_wafer");
        GTBMetaItems.N_DOPED_SILICON_DIOXIDE_WAFER = addItem(9, "n_doped_silicon_dioxide_wafer");
        GTBMetaItems.SINGLE_JOSEPHSON_JUNCTION_LITHOGRAPHY_MASK = addItem(10,
                "single_josephson_junction_lithography_mask");
        GTBMetaItems.DOPED_POWER_IC_WAFER = addItem(11, "doped_power_ic_wafer");
        GTBMetaItems.DOPED_RAM_WAFER = addItem(12, "doped_ram_wafer");
        GTBMetaItems.DOPED_IC_WAFER = addItem(13, "doped_ic_wafer");
        GTBMetaItems.DOPED_HIGH_POWER_IC_WAFER = addItem(14, "doped_high_power_ic_wafer");
        GTBMetaItems.DOPED_CPU_WAFER = addItem(15, "doped_cpu_wafer");
        GTBMetaItems.DOPED_POLYSILICON_WAFER = addItem(16, "doped_polysilicon_wafer");
        GTBMetaItems.ENGRAVED_POWER_IC_WAFER = addItem(17, "engraved_power_ic_wafer");
        GTBMetaItems.ENGRAVED_CPU_WAFER = addItem(18, "engraved_cpu_wafer");
        GTBMetaItems.ENGRAVED_IC_WAFER = addItem(19, "engraved_ic_wafer");
        GTBMetaItems.ENGRAVED_TITANATE_SUBSTRATE_WAFER = addItem(20, "engraved_titanate_substrate_wafer");
        GTBMetaItems.ENGRAVED_RAM_WAFER = addItem(21, "engraved_ram_wafer");
        GTBMetaItems.CONTROLLED_SHAPED_NAQUADRIA_CHARGE = addItem(22, "controlled_shaped_naquadria_charge");
        GTBMetaItems.CONTROLLED_SHAPED_NAQUADRIA_CHARGE_CASING = addItem(23,
                "controlled_shaped_naquadria_charge_casing");
        GTBMetaItems.RAM_LITHOGRAPHY_MASK = addItem(24, "ram_lithography_mask");
        GTBMetaItems.CPU_LITHOGRAPHY_MASK = addItem(25, "cpu_lithography_mask");
        GTBMetaItems.LPIC_LITHOGRAPHY_MASK = addItem(26, "lpic_lithography_mask");
        GTBMetaItems.MANUFACTURED_SUPERCONDUCTOR_CIRCUIT = addItem(27, "manufactured_superconductor_circuit");
        GTBMetaItems.SPUTTERED_SAPPHIRE_SUBSTRATE = addItem(28, "sputtered_sapphire_substrate");
        GTBMetaItems.UHPIC_BASE = addItem(29, "uhpic_base");
        GTBMetaItems.UHPIC_BASE_WAFER = addItem(30, "uhpic_base_wafer");
        GTBMetaItems.UHPIC_LITHOGRAPHY_MASK = addItem(31, "uhpic_lithography_mask");
        GTBMetaItems.PIC_LITHOGRAPHY_MASK = addItem(32, "pic_lithography_mask");
        GTBMetaItems.LITHOGRAPHY_BASE_MASK = addItem(33, "lithography_base_mask");
        GTBMetaItems.WIRED_SUBSTRATE_WAFER = addItem(34, "wired_substrate_wafer");
        GTBMetaItems.SUPERCONDUCTOR_COATED_SUBSTRATE_WAFER = addItem(35, "superconductor_coated_substrate_wafer");
        GTBMetaItems.BARIUM_TITANATE_SUBSTRATE_WAFER = addItem(36, "barium_titanate_substrate_wafer");
        GTBMetaItems.BARIUM_TITANATE_BOULE = addItem(37, "barium_titanate_boule");
        GTBMetaItems.BARIUM_TITANTE_SEED_CRYSTAL = addItem(38, "barium_titanate_seed_crystal");
        GTBMetaItems.TREATED_PHOTOCOATED_HASSIUM_WAFER = addItem(39, "treated_photocoated_hassium_wafer");
        GTBMetaItems.UNPREPARATED_CELA_BOULE = addItem(40, "unpreparated_cela_boule");
        GTBMetaItems.CRUICIBLE_MOLD = addItem(41, "cruicible_mold");
        GTBMetaItems.GRAPHITE_CRUICIBLE = addItem(42, "graphite_cruicible");
        GTBMetaItems.SOC_WAFER_BASE = addItem(43, "soc_wafer_base");
        GTBMetaItems.ENGRAVED_SOC_WAFER = addItem(44, "engraved_soc_wafer");
        GTBMetaItems.UHASOC_LITHOGRAPHY_MASK = addItem(45, "uhasoc_lithography_mask");
        GTBMetaItems.SHAPED_HIGH_ENERGY_GAMMA_SHIELD = addItem(46, "shaped_high_energy_gamma_shield");
        GTBMetaItems.PRE_ENGRAVED_UHASOC_WAFER = addItem(47, "pre_engraved_uhasoc_wafer");
        GTBMetaItems.SUPERCONDUCTOR_LAYERED_UHASOC_WAFER = addItem(48, "superconductor_layered_uhasoc_wafer");
        GTBMetaItems.DEGENERATE_UHASOC_WAFER = addItem(49, "degenerate_uhasoc_wafer");
        GTBMetaItems.CELLED_UHASOC_WAFER = addItem(50, "celled_uhasoc_wafer");
        GTBMetaItems.SPIN_ALIGNED_UHASOC_WAFER = addItem(51, "spin_aligned_uhasoc_wafer");
        GTBMetaItems.UHASOC_POST_ENGRAVING_MASK = addItem(52, "uhasoc_post_engraving_mask");
        GTBMetaItems.RELAYERED_UHASOC_WAFER = addItem(53, "relayered_uhasoc_wafer");
        GTBMetaItems.FULLY_CONNECTED_UHASOC_WAFER = addItem(54, "fully_connected_uhasoc_wafer");
        GTBMetaItems.SUPERCOOLED_UHASOC_WAFER = addItem(55, "supercooled_uhasoc_wafer");
        GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_BOULE = addItem(56, "monocrystalline_inp_boule");
        GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_INGOT = addItem(57, "monocrystalline_inp_ingot");
        GTBMetaItems.MONOCRYSTALLINE_INDIUM_PHOSPHIDE_SEED_CRYSTAL = addItem(58, "monocrystalline_inp_seed_crystal");
        GTBMetaItems.INDIUM_PHOSPHIDE_WAFER = addItem(59, "indium_phosphide_wafer");
        GTBMetaItems.ZBLAN_LAYERED_INP_WAFER = addItem(60, "zblan_layered_inp_wafer");
        GTBMetaItems.RESONANT_INP_WAFER = addItem(61, "resonant_inp_wafer");
        GTBMetaItems.INSULATED_INP_WAFER = addItem(62, "insulated_inp_wafer");
        GTBMetaItems.RE_EXPOSED_INP_WAFER = addItem(63, "re_exposed_inp_wafer");
        GTBMetaItems.ELECTROLUMINESCENT_INP_WAFER = addItem(64, "electroluminescent_inp_wafer");
        GTBMetaItems.RECOATED_INP_WAFER = addItem(65, "recoated_inp_wafer");
        GTBMetaItems.CONTACT_READY_INP_WAFER = addItem(66, "contact_ready_inp_wafer");
        GTBMetaItems.UNINSULATED_OPTICAL_SOC = addItem(67, "uninsulated_optical_soc");
        GTBMetaItems.CONTACTLESS_OPTICAL_SOC = addItem(68, "contactless_optical_soc");
        GTBMetaItems.INSULATED_OPTICAL_SOC = addItem(69, "insulated_optical_soc");
        GTBMetaItems.PHOTOGENALLY_ENHANCED_WAFER = addItem(70, "photogenally_enhanced_wafer");
        GTBMetaItems.DOPED_SOC_WAFER = addItem(71, "doped_soc_wafer");
        GTBMetaItems.FCELAUWAFER = addItem(72, "fcelauwafer");
        GTBMetaItems.CELAWAFER = addItem(73, "celawafer");
        GTBMetaItems.CELA_SILICON_BOULE = addItem(74, "cela_silicon_boule");
        GTBMetaItems.LANTHANUM_SEED_CRYSTAL = addItem(75, "lanthanum_seed_crystal");
        GTBMetaItems.OGANESSON_SEED_CRYSTAL = addItem(76, "oganesson_seed_crystal");
        GTBMetaItems.OGANESSON_BOULE = addItem(77, "oganesson_boule");
        GTBMetaItems.HASOC_LITHOGRAPHY_MASK = addItem(78, "hasoc_lithography_mask");
        GTBMetaItems.MONOCRYSTALLINE_OGANESSON_INGOT = addItem(79, "monocrystalline_oganesson_ingot");
        GTBMetaItems.OGANESSON_WAFER = addItem(80, "oganesson_wafer");
        GTBMetaItems.TREATED_OGANESSON_WAFER = addItem(81, "treated_oganesson_wafer");
        GTBMetaItems.PRE_ENGRAVING_OGANESSON_LITHOGRAPHY_MASK = addItem(82, "pre_engraving_oganesson_lithography_mask");
        GTBMetaItems.PRE_ENGRAVED_OGANESSON_WAFER = addItem(83, "engraved_oganesson_wafer");
        GTBMetaItems.RAW_OGANESSON_WAFER = addItem(84, "raw_oganesson_wafer");
        GTBMetaItems.DOPED_OGANESSON_WAFER = addItem(85, "doped_oganesson_wafer");
        GTBMetaItems.ENGRAVED_UHASOC_WAFER = addItem(86, "engraved_uhasoc_wafer");
        GTBMetaItems.BATHED_TREATED_OGANESSON_WAFER = addItem(87, "bathed_treated_oganesson_wafer");
        GTBMetaItems.UNPOLARIZED_HASOC_WAFER = addItem(88, "unpolarized_hasoc_wafer");
        GTBMetaItems.HASOC_DIE = addItem(89, "hasoc_die");
        GTBMetaItems.BIOSAFE_PROTECTIVE_PLATING = addItem(90, "biosafe_protective_plating");
        GTBMetaItems.CLEAN_HASOC_DIE = addItem(91, "clean_hasoc_die");
        GTBMetaItems.NEURAL_IMPLANTED_HASOC_DIE = addItem(92, "neural_implanted_hasoc_die");
        GTBMetaItems.GROWN_HASOC_DIE = addItem(93, "grown_hasoc_die");
        GTBMetaItems.NEUROLOGICAL_LIFE_SUPPORT_UNIT = addItem(94, "neurological_life_support_unit");
        GTBMetaItems.SAPPHIRE_SEED_CRYSTAL = addItem(96, "sapphire_seed_crystal");
        GTBMetaItems.SAPPHIRE_BOULE = addItem(97, "sapphire_boule");
        GTBMetaItems.MONOCRYSTALLINE_SAPPHIRE_INGOT = addItem(98, "monocrystalline_sapphire_ingot");
        GTBMetaItems.SAPPHIRE_WAFER = addItem(99, "sapphire_wafer");
        GTBMetaItems.QBIT_CPU_LITHOGRAPHY_MASK = addItem(100, "qbit_cpu_lithography_mask");
        GTBMetaItems.ENGRAVED_QBIT_CPU_WAFER = addItem(101, "engraved_qbit_cpu_wafer");
        GTBMetaItems.DOPED_QBIT_CPU_WAFER = addItem(102, "doped_qbit_cpu_wafer");
        GTBMetaItems.SUPERCONDUCTOR_COATED_QBIT_CPU_WAFER = addItem(103, "superconductor_coated_qbit_cpu_wafer");
        GTBMetaItems.U_TWOFOURTY_ELECTRON_SOURCE = addItem(104, "u_twofourty_electron_source");
        GTBMetaItems.QBIT_CPU_DIE = addItem(105, "qbit_cpu_die");
        GTBMetaItems.COVERED_QBIT_CPU = addItem(106, "covered_qbit_cpu");
        GTBMetaItems.CELAUWAFER = addItem(108, "celauwafer");
        GTBMetaItems.SILICON_DIOXIDE_WAFER = addItem(109, "silicon_dioxide_wafer");
        GTBMetaItems.ENGRAVED_NANOCPU_WAFER = addItem(110, "engraved_nanocpu_wafer");
        GTBMetaItems.DOPED_NANOCPU_WAFER = addItem(111, "doped_nanocpu_wafer");
        GTBMetaItems.NANOCPU_LITHOGRAPHY_MASK = addItem(112, "nanocpu_lithography_mask");
        GTBMetaItems.GATED_NANOCPU_WAFER = addItem(113, "gated_nanocpu_wafer");
        GTBMetaItems.INSULATED_NANOCPU_WAFER = addItem(114, "insulated_nanocpu_wafer");
        GTBMetaItems.TRENCHED_INSULATED_NANOCPU_WAFER = addItem(115, "trenched_insulated_nanocpu_wafer");
        GTBMetaItems.UNPLANARIZED_NANOCPU_WAFER = addItem(116, "unplanarized_nanocpu_wafer");
        GTBMetaItems.NICKEL_NITRIDE_WAFER = addItem(121, "nickel_nitride_wafer");
        GTBMetaItems.ENGRAVED_NOR_WAFER = addItem(122, "engraved_nor_wafer");
        GTBMetaItems.ENGRAVED_NAND_WAFER = addItem(123, "engraved_nand_wafer");
        GTBMetaItems.FLEROVIUM_LAYERED_WAFER = addItem(124, "flerovium_layered_wafer");
        GTBMetaItems.SPINORIAL_MEMORY_WAFER = addItem(125, "spinorial_memory_wafer");
        GTBMetaItems.PRE_ENGRAVED_NQO2_WAFER = addItem(126, "pre_engraved_nqo2_wafer");
        GTBMetaItems.ENRICHED_NAQUADAH_PHOTOLITHOGRAPHY_MASK = addItem(127, "enriched_naquadah_photolithography_mask");
        GTBMetaItems.DOPED_ASOC_WAFER = addItem(128, "doped_asoc_wafer");
        GTBMetaItems.ENGRAVED_ASOC_WAFER = addItem(129, "engraved_asoc_wafer");
        GTBMetaItems.ENGRAVED_SPINORIAL_MEMORY_WAFER = addItem(130, "engraved_spinorial_memory_wafer");
        GTBMetaItems.DOPED_ARAM_WAFER = addItem(131, "doped_aram_wafer");
        GTBMetaItems.UNBAKED_MONOCRYSTALLINE_SILICON_BOULE = addItem(132, "unbaked_monocrystalline_silicon_boule");
        GTBMetaItems.PHOTOPOLYMER_PLATE = addItem(133, "photopolymer_plate");
        GTBMetaItems.INTEGRATED_CIRCUIT_LITHOGRAPHY_MASK = addItem(134, "integrated_circuit_lithography_mask");
        GTBMetaItems.NAQUADAH_DIOXDE_SEED_CRYSTAL = addItem(135, "naquadah_dioxide_seed_crystal");
        GTBMetaItems.NAQUADAH_DIOXDE_BOULE = addItem(136, "naquadah_dioxide_boule");
        GTBMetaItems.NAQUADAH_DIOXIDE_WAFER = addItem(137, "naquadah_dioxide_wafer");
        GTBMetaItems.SOC_LITHOGRAPHY_MASK = addItem(138, "soc_lithography_mask");
        GTBMetaItems.TRENCHED_NAQUADAH_DIOXIDE_WAFER = addItem(139, "trenched_naquadah_dioxide_wafer");
        GTBMetaItems.NICKEL_BREEDING_BED = addItem(140, "nickel_breeding_bed");
        GTBMetaItems.OPTICAL_LITHOGRAPHY_MASK = addItem(141, "optical_lithography_mask");
        GTBMetaItems.INTERCONNECTED_INP_WAFER = addItem(142, "interconnected_inp_wafer");
        GTBMetaItems.PHOTOCOATED_HASSIUM_WAFER = addItem(143, "photocoated_hassium_wafer");
        GTBMetaItems.QBIT_CPU_WAFER = addItem(144, "qbit_cpu_wafer");
        GTBMetaItems.NOR_PHOTOLITHOGRAPHY_MASK = addItem(145, "nor_photolithography_mask");
        GTBMetaItems.NAND_PHOTOLITHOGRAPHY_MASK = addItem(146, "nand_photolithography_mask");
        GTBMetaItems.ARAM_WAFER = addItem(147, "aram_wafer");
        GTBMetaItems.UHASOC_WAFER = addItem(148, "uhasoc_wafer");
        GTBMetaItems.OPTICAL_SOC_WAFER = addItem(149, "optical_soc_wafer");
        GTBMetaItems.QBIT_CPU = addItem(150, "qbit_cpu");
        GTBMetaItems.OPTICAL_SOC = addItem(151, "optical_soc");
        GTBMetaItems.BITUMINOUS_RESIDUES = addItem(4, "bituminous_residues");
        GTBMetaItems.DAMASCUS_STEEL_ASSEMBLY = addItem(152, "damascus_steel_assembly");
        GTBMetaItems.HOT_DAMASCUS_STEEL_ASSEMBLY = addItem(153, "hot_damascus_steel_assembly");
        GTBMetaItems.LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(154, "lightly_forged_damascus_steel_assembly");
        GTBMetaItems.HOT_LIGHTLY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(155,
                "hot_lightly_forged_damascus_steel_assembly");
        GTBMetaItems.MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(156,
                "moderately_forged_damascus_steel_assembly");
        GTBMetaItems.HOT_MODERATELY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(157,
                "hot_moderately_forged_damascus_steel_assembly");
        GTBMetaItems.HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(158, "highly_forged_damascus_steel_assembly");
        GTBMetaItems.HOT_HIGHLY_FORGED_DAMASCUS_STEEL_ASSEMBLY = addItem(159,
                "hot_highly_forged_damascus_steel_assembly");
    }
}
