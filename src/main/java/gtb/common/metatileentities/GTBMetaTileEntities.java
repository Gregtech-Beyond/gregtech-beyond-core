package gtb.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gtb.api.utils.GTBUtil.gtb;

import gtb.common.metatileentities.multiblocks.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GTBMetaTileEntities {

    public static MetaTileEntityWaterTank WATER_TANK;
    public static MetaTileEntitySolarThermalConcentrator SOLAR_THERMAL_CONCENTRATOR;
    public static MetaTileEntityBacterialVat BACTERIAL_VAT;
    public static MetaTileEntityVacuumFurnace VACUUM_FURNACE;
    public static MetaTileEntityAstroMiningStation ASTRO_MINING_STATION;
    public static MetaTileEntityBedrockPump BEDROCK_PUMP;
    public static MetaTileEntityBlackHoleCompressor BLACK_HOLE_COMPRESSOR;
    public static MetaTileEntityCatalyticReformationUnit CATALYTIC_REFORMATION_UNIT;

    public static void init() {
        // Multiblocks
        WATER_TANK = registerMetaTileEntity(3000, new MetaTileEntityWaterTank(gtb("water_tank")));
        SOLAR_THERMAL_CONCENTRATOR = registerMetaTileEntity(3001, new MetaTileEntitySolarThermalConcentrator(gtb("solar_thermal_concentrator")));
        BACTERIAL_VAT = registerMetaTileEntity(3002, new MetaTileEntityBacterialVat(gtb("bacterial_vat")));
        VACUUM_FURNACE = registerMetaTileEntity(3003, new MetaTileEntityVacuumFurnace(gtb("vacuum_furnace")));
        ASTRO_MINING_STATION = registerMetaTileEntity(3004, new MetaTileEntityAstroMiningStation(gtb("astro_mining_station")));
        BEDROCK_PUMP  = registerMetaTileEntity(3005, new MetaTileEntityBedrockPump(gtb("bedrock_pump")));
        BLACK_HOLE_COMPRESSOR  = registerMetaTileEntity(3006, new MetaTileEntityBlackHoleCompressor(gtb("black_hole_compressor")));
        CATALYTIC_REFORMATION_UNIT  = registerMetaTileEntity(3006, new MetaTileEntityCatalyticReformationUnit(gtb("catalytic_reformation_unit")));

    }

}
