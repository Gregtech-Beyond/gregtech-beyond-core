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
        GTBMetaItems.LASER_ASSEMBLY = addItem(4, "laser_assembly");
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
        GTBMetaItems.MONOCRYSTALLINE_OGANESSON_INGOT = addItem(79, "monocrystalline_oganesson_ingot");
        GTBMetaItems.OGANESSON_WAFER = addItem(80, "oganesson_wafer");
        GTBMetaItems.TREATED_OGANESSON_WAFER = addItem(81, "treated_oganesson_wafer");
        GTBMetaItems.PRE_ENGRAVING_OGANESSON_LITHOGRAPHY_MASK = addItem(82, "pre_engraving_oganesson_lithography_mask");
        GTBMetaItems.ENGRAVED_OGANESSON_WAFER = addItem(83, "engraved_oganesson_wafer");
        GTBMetaItems.RAW_OGANESSON_WAFER = addItem(84, "raw_oganesson_wafer");
        GTBMetaItems.DOPED_OGANESSON_WAFER = addItem(85, "doped_oganesson_wafer");
        GTBMetaItems.ENGRAVED_HASOC_WAFER = addItem(86, "engraved_hasoc_wafer");
        GTBMetaItems.BATHED_TREATED_OGANESSON_WAFER = addItem(87, "bathed_treated_oganesson_wafer");
        GTBMetaItems.UNPOLARIZED_HASOC_WAFER = addItem(88, "unpolarized_hasoc_wafer");
        GTBMetaItems.UHASOC_DIE = addItem(89, "hasoc_die");
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
        GTBMetaItems.COVERED_QBIT_CPU = addItem(95, "covered_qbit_cpu");
        GTBMetaItems.LITHIUM_SIEVE = addItem(106, "lithium_sieve");
        GTBMetaItems.LITHIUM_SATURATED_LITHIUM_SIEVE = addItem(107, "lithium_saturated_sieve_lithium");
        GTBMetaItems.CELAUWAFER = addItem(108, "celauwafer");
        GTBMetaItems.SILICON_DIOXIDE_WAFER = addItem(109, "silicon_dioxide_wafer");
        GTBMetaItems.ENGRAVED_NANOCPU_WAFER = addItem(110, "engraved_nanocpu_wafer");
        GTBMetaItems.DOPED_NANOCPU_WAFER = addItem(111, "doped_nanocpu_wafer");
        GTBMetaItems.NANOCPU_LITHOGRAPHY_MASK = addItem(112, "nanocpu_lithography_mask");
        GTBMetaItems.GATED_NANOCPU_WAFER = addItem(113, "gated_nanocpu_wafer");
        GTBMetaItems.INSULATED_NANOCPU_WAFER = addItem(114, "insulated_nanocpu_wafer");
        GTBMetaItems.TRENCHED_INSULATED_NANOCPU_WAFER = addItem(115, "trenched_insulated_nanocpu_wafer");
        GTBMetaItems.UNPLANARIZED_NANOCPU_WAFER = addItem(116, "unplanarized_nanocpu_wafer");
        GTBMetaItems.BORON_SATURATED_YARN = addItem(117, "boron_saturated_yarn");
        GTBMetaItems.BORON_RETAINING_YARN = addItem(118, "boron_retaining_yarn");
        GTBMetaItems.COOLANT_CELL = addItem(119, "coolant_cell");
        GTBMetaItems.NAK_COOLANT_CELL = addItem(181, "nak_coolant_cell");
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
        GTBMetaItems.NOR_PHOTOLITHOGRAPHY_MASK = addItem(145, "nor_photolithography_mask");
        GTBMetaItems.NAND_PHOTOLITHOGRAPHY_MASK = addItem(146, "nand_photolithography_mask");
        GTBMetaItems.ARAM_WAFER = addItem(147, "aram_wafer");
        GTBMetaItems.UHASOC_WAFER = addItem(148, "uhasoc_wafer");
        GTBMetaItems.OPTICAL_SOC_WAFER = addItem(149, "optical_soc_wafer");
        GTBMetaItems.OPTICAL_SOC = addItem(151, "optical_soc");
        GTBMetaItems.BITUMINOUS_RESIDUES = addItem(120, "bituminous_residues");
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
        GTBMetaItems.STERILIZED_PETRI_DISH = addItem(161, "sterilized_petri_dish");
        GTBMetaItems.PLUS_STERILIZED_PETRI_DISH = addItem(162, "plus_sterilized_petri_dish");
        GTBMetaItems.CONTAMINATED_STERILIZED_PETRI_DISH = addItem(163, "contaminated_sterilized_petri_dish");
        GTBMetaItems.PETRI_DISH_MOLD = addItem(164, "petri_dish_mold");
        GTBMetaItems.CUPRIAVIDUS_BACTERIA_SAMPLE_PETRI_DISH = addItem(165, "cupriavidus_bacteria_sample_petri_dish");
        GTBMetaItems.ULTRASONIC_HOMOGENIZER = addItem(166, "ultrasonic_homogenizer");
        GTBMetaItems.YEAST_CELLS = addItem(167, "yeast_cells");
        GTBMetaItems.GROWN_YEAST_CULTURE = addItem(168, "grown_yeast_culture");
        GTBMetaItems.BARLEY = addItem(169, "barley");
        GTBMetaItems.SYRINGE = addItem(170, "syringe");
        GTBMetaItems.STERILIZED_SYRINGE = addItem(171, "sterilized_syringe");
        GTBMetaItems.SHEEP_BLOOD_SYRINGE = addItem(172, "sheep_blood_syringe");
        GTBMetaItems.COTTON = addItem(173, "cotton");
        GTBMetaItems.COTTON_SHEET = addItem(174, "cotton_sheet");
        GTBMetaItems.CHEESE_CLOTH = addItem(175, "cheese_cloth");
        GTBMetaItems.PANCREAS = addItem(176, "pancreas");
        GTBMetaItems.YEEM_PETRI = addItem(177, "yeem_petri");
        GTBMetaItems.SOY_BEAN = addItem(178, "soy_bean");
        GTBMetaItems.CUPRIAVIDUS_NECATOR_CULTURE = addItem(180, "cupriavidus_necator_culture");
        GTBMetaItems.PAD_PETRI_DISH = addItem(182, "pad_petri_dish");
        GTBMetaItems.UVA_HALIDE_LAMP = addItem(183, "uva_halide_lamp");
        GTBMetaItems.LITHIUM_FOAM_BASE = addItem(184, "lithium_foam_base");
        GTBMetaItems.ALUMINO_SILICATE_WOOL_SHEET = addItem(185, "alumino_silicate_wool_sheet");
        GTBMetaItems.ROTARRY_SPINNING_WHISKER = addItem(186, "rotarry_spinning_whisker");
        GTBMetaItems.CHROMATIC_GLASS_FIBER = addItem(187, "chromatic_glass_fiber");
        GTBMetaItems.SATURATED_CHROMATIC_GLASS_FIBER = addItem(188, "saturated_chromatic_glass_fiber");
        GTBMetaItems.SINTERED_SILVER_COIL = addItem(189, "sintered_silver_coil");
        GTBMetaItems.VACUUM_TUBE_COMPONENTS = addItem(190, "vacuum_tube_components");
        GTBMetaItems.THICK_FILM_WAFER = addItem(191, "thick_film_wafer");
        GTBMetaItems.THICK_FILM_RESISTOR_BASE_WAFER = addItem(192, "thick_film_resistor_base_wafer");
        GTBMetaItems.THICK_FILM_RESISTOR_WAFER = addItem(193, "thick_film_resistor_wafer");
        GTBMetaItems.TRANSISTOR_WAFER = addItem(194, "transistor_wafer");
        GTBMetaItems.PATTERENED_SILICON_DIOXIDE_WAFER = addItem(195, "patterend_silicon_dioxide_wafer");
        GTBMetaItems.INDUCTOR_LITHOGRAPHY_MASK = addItem(196, "inductor_lithography_mask");
        GTBMetaItems.ETCHED_INDUCTOR_WAFER = addItem(197, "etched_inductor_wafer");
        GTBMetaItems.INDUCTOR_WAFER = addItem(198, "inductor_wafer");
        GTBMetaItems.REINFORCED_BASE_WAFER = addItem(199, "reinforced_base_wafer");
        GTBMetaItems.PATTERENED_BASE_WAFER = addItem(200, "patterened_base_wafer");
        GTBMetaItems.DIODE_WAFER = addItem(201, "diode_wafer");
        GTBMetaItems.ALUMINIUM_CAPACITOR = addItem(202, "aluminium_capacitor");
        GTBMetaItems.RAW_CAPACITOR_ROLL = addItem(203, "raw_capacitor_roll");
        GTBMetaItems.PATTERENED_PHENOLIC_CIRCUIT_BOARD = addItem(204, "patterened_phenol_circuit_board");
        GTBMetaItems.LAMINATED_EPOXY_BOARD = addItem(205, "laminated_epoxy_board");
        GTBMetaItems.ENGRAVED_EPOXY_BOARD = addItem(206, "engraved_epoxy_board");
        GTBMetaItems.PATTERENED_EPOXY_BOARD = addItem(207, "patterened_epoxy_board");
        GTBMetaItems.TRANSISTOR_BASE_WAFER = addItem(208, "transistor_base_wafer");
        GTBMetaItems.BIOLOGICALLY_APPROVED_LENS = addItem(209, "biologically_approved_lens");
        GTBMetaItems.NEURO_SUPPORT_UNIT = addItem(210, "neuro_support_unit");
        GTBMetaItems.ELECTRICALLY_WIRED_PETRI_DISH = addItem(211, "electrically_wired_petri_dish");
        GTBMetaItems.BIFIDOBACTERERIUM_BRAVE_CULTURE = addItem(212, "bifidobacterium_brave_culture");
        GTBMetaItems.STEM_CELL_LAB_ON_CHIP = addItem(213, "stem_cell_lab_on_chip");
        GTBMetaItems.LAB_ON_CHIP = addItem(214, "lab_on_chip");
        GTBMetaItems.LAB_ON_CHIP_BASE = addItem(215, "lab_on_chip_base");
        GTBMetaItems.ANNEALED_NICKEL_PLATE = addItem(216, "annealed_nickel_plate");
        GTBMetaItems.PIEZOELECTRIC_CRYSTAL = addItem(217, "piezoelectric_crystal");
        GTBMetaItems.LAMINATED_RER_BOARD = addItem(218, "laminated_rer_board");
        GTBMetaItems.PATTERENED_PR4_PLATE = addItem(219, "patterned_pr4_plate");
        GTBMetaItems.ETCHED_PR4_PLATE = addItem(220, "etched_pr4_plate");
        GTBMetaItems.PLANAR_TRANSFORMER = addItem(221, "planar_transformer");
        GTBMetaItems.SPUTTERED_PR4_PLATE = addItem(222, "sputtered_pr4_plate");
        GTBMetaItems.PRESSED_PR4_PLATE = addItem(223, "pressed_pr4_plate");
        GTBMetaItems.NEODYMIUM_MAGNET = addItem(224, "neodymium_magnet");
        GTBMetaItems.BITUMEN_CRYSTAL = addItem(225, "bitumen_crystal");
        GTBMetaItems.ASPHALT = addItem(226, "asphalt");
        GTBMetaItems.NANO_SMD_DIODE = addItem(227, "nano_smd_diode");
        GTBMetaItems.NANO_SMD_TRANSISTOR = addItem(228, "nano_smd_transistor");
        GTBMetaItems.NANO_SMD_CAPACITOR = addItem(229, "nano_smd_capacitor");
        GTBMetaItems.NANO_SMD_INDUCTOR = addItem(230, "nano_smd_inductor");
        GTBMetaItems.NANO_SMD_RESISTOR = addItem(231, "nano_smd_resistor");
        GTBMetaItems.GDSII_LITHOGRAPHY_MASK = addItem(232, "gdsii_lithography_mask");
        GTBMetaItems.GDSII_MASKED_WAFER = addItem(233, "gdsii_masked_wafer");
        GTBMetaItems.DOPED_GDSII_WAFER = addItem(234, "doped_gdsii_wafer");
        GTBMetaItems.THIN_COPPER_SHEET = addItem(235, "thin_copper_sheet");
        GTBMetaItems.CONNECTED_GDSII_WAFER = addItem(236, "connected_gdsii_wafer");
        GTBMetaItems.ETCHED_GDSII_WAFER = addItem(237, "etched_gdsii_wafer");
        GTBMetaItems.GDSII_CHIP = addItem(238, "gdsii_chip");
        GTBMetaItems.DIP_8_PACKAGE = addItem(239, "dip_8_package");
        GTBMetaItems.DIP_8_MICROCONTROLLER = addItem(240, "dip_8_microcontroller");
    }
}
