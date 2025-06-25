package gtb.common.metatileentities.multiblocks;

import static asmodeuscore.core.handler.ColorBlockHandler.world;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.blocks.StoneVariantBlock;

import gregicality.multiblocks.api.render.GCYMTextures;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;

import gtb.api.recipes.GTBRecipeMaps;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.GTBMultiblockCasing2;
import micdoodle8.mods.galacticraft.api.entity.IFuelable;

public class MetaTileEntityRocketLaunchPad extends RecipeMapMultiblockController {

    private final FluidTank fuelTank;

    public MetaTileEntityRocketLaunchPad(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.ROCKET_LAUNCH_PAD_RECIPES);

        this.fuelTank = new FluidTank(8000) {

            @Override
            public boolean canFillFluidType(FluidStack fluid) {
                if (fluid == null) return false;
                // Accept fluids whose name is "fuel" or common Galacticraft fuel fluids
                String fluidName = fluid.getFluid().getName();
                return "fuel".equals(fluidName) || "gc_fuel".equals(fluidName) || "rocket_fuel".equals(fluidName);
            }
        };
    }

    @Override
    public void update() {
        super.update();

        if (getWorld().isRemote || !isStructureFormed()) return;

        IFuelable fuelableRocket = findFuelableRocket();
        if (fuelableRocket == null) return;

        FluidStack fluid = fuelTank.getFluid();
        if (fluid != null && fluid.amount > 0) {
            Fluid fuelFluid = fluid.getFluid();
            if (fuelFluid == null) return;

            int fuelToTransfer = Math.min(40, fluid.amount);

            // This is the expected call:
            int used = fuelableRocket.addFuel(fluid, true);

            if (used > 0) {
                fuelTank.drain(used, true);
            } else {}
        }
    }

    private IFuelable findFuelableRocket() {
        World world = getWorld();
        if (world == null || getPos() == null) {
            return null;
        }

        BlockPos controllerPos = getPos();
        AxisAlignedBB searchBox = new AxisAlignedBB(controllerPos).grow(5);

        List<Entity> entities = world.getEntitiesWithinAABB(Entity.class, searchBox);
        for (Entity entity : entities) {
            if (entity instanceof IFuelable) {
                return (IFuelable) entity;
            }
        }
        return null;
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing side) {
        if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
            return true;
        }
        return super.hasCapability(capability, side);
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing side) {
        if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
            return CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY.cast(fuelTank);
        }
        return super.getCapability(capability, side);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setTag("FuelTank", fuelTank.writeToNBT(new NBTTagCompound()));
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        fuelTank.readFromNBT(compound.getCompoundTag("FuelTank"));
    }

    public IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING
                .getState(BlockLargeMultiblockCasing.CasingType.CORROSION_PROOF_CASING);
    }

    @Override
    protected @NotNull BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
                .aisle(
                        "~~~CCCCC~~~",
                        "~~CLLLLLC~~",
                        "~CLLLLLLLC~",
                        "CLLLCCCLLLC",
                        "CLLCRRRCLLC",
                        "CLLCRRRCLLC",
                        "CLLCRRRCLLC",
                        "CLLLCCCLLLC",
                        "~CLLLLLLLC~",
                        "~~CLLLLLC~~",
                        "~~~CCSCC~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~FFFCFFF~~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~~F~~~~~F~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~FFFCFFF~~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~~F~~~~~F~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~FFFCFFF~~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~~F~~~~~F~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~FFFCFFF~~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~~F~~~~~F~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~FFFCFFF~~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~~F~~~~~F~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~FFFCFFF~~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~~F~~~~~F~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~FFFCFFF~~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~~F~~~~~F~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~FFFCFFF~~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~F~~~~~~~F~",
                        "~~F~~~~~F~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~C~C~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .aisle(
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~C~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~",
                        "~~~~~~~~~~~")
                .where('S', selfPredicate())
                .where('~', any())
                .where('C', states(getCasingState()).setMinGlobalLimited(80)
                        .or(autoAbilities()))
                .where('R',
                        states(GTBMetaBlocks.GTB_MULTIBLOCK_CASING2
                                .getState(GTBMultiblockCasing2.CasingType.ROCKET_BLOCK_BASE)))
                .where('L',
                        states(MetaBlocks.STONE_BLOCKS.get(StoneVariantBlock.StoneVariant.SMOOTH)
                                .getState(StoneVariantBlock.StoneType.CONCRETE_LIGHT)))
                .where('F', frames(Materials.Steel))
                .build();
    }

    @Override
    public TraceabilityPredicate autoAbilities() {
        return autoAbilities(true, true, true, true, true, true, true);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return GCYMTextures.CORROSION_PROOF_CASING;
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.ASSEMBLER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityRocketLaunchPad(metaTileEntityId);
    }
}
