package gtb.api.metatileentity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandlerModifiable;

import org.jetbrains.annotations.NotNull;

import gregtech.api.GTValues;
import gregtech.api.capability.impl.*;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.ModularUI;
import gregtech.api.gui.widgets.LabelWidget;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.SteamMetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.recipes.RecipeMap;
import gregtech.client.particle.VanillaParticleEffects;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;

import gtb.api.utils.GTBUtil;

public class BasicSteamMachine extends SteamMetaTileEntity {

    public static BasicSteamMachine addSteamMachine(String machineName, boolean isHighPressure,
                                                    @NotNull RecipeMap<?> recipeMap) {
        OrientedOverlayRenderer overlay = new OrientedOverlayRenderer("machines/" + machineName);
        return new BasicSteamMachine(GTBUtil.gtb(machineName), isHighPressure, recipeMap, overlay);
    }

    private final OrientedOverlayRenderer machineOverlay;
    private final int tankCapacity = 3000;
    private boolean canInitializeInventories = false;
    private FluidTankList tanksToDisplay;

    protected BasicSteamMachine(ResourceLocation metaTileEntityId, boolean isHighPressure,
                                @NotNull RecipeMap<?> recipeMap, OrientedOverlayRenderer overlay) {
        super(metaTileEntityId, recipeMap, overlay, isHighPressure);
        this.machineOverlay = overlay;
        this.canInitializeInventories = true;
        initializeInventory();
        canInitializeInventories = false; // To remove after tests
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new BasicSteamMachine(metaTileEntityId, isHighPressure, getRecipeMap(), machineOverlay);
    }

    /**
     * Only call it when the recipemap has been set, which happens in {@link SteamMetaTileEntity} AFTER
     * {@link MetaTileEntity}
     * calls this.
     */
    @Override
    protected void initializeInventory() {
        if (canInitializeInventories) super.initializeInventory();
    }

    /**
     * Will only be called when the {@link SteamMetaTileEntity#workableHandler} as been instantiated so not risk
     * for a {@link NullPointerException}.
     */
    @SuppressWarnings(value = "ConstantConditions")
    @Override
    protected IItemHandlerModifiable createImportItemHandler() {
        int maxInputs = getRecipeMap().getMaxInputs();
        if (maxInputs > 0) {
            return new NotifiableItemStackHandler(this, maxInputs, this, false);
        } else return super.createImportItemHandler();
    }

    /**
     * Will only be called when the {@link SteamMetaTileEntity#workableHandler} as been instantiated so not risk
     * for a {@link NullPointerException}.
     */
    @SuppressWarnings(value = "ConstantConditions")
    @Override
    protected IItemHandlerModifiable createExportItemHandler() {
        int maxOutputs = getRecipeMap().getMaxOutputs();
        if (maxOutputs > 0) {
            return new NotifiableItemStackHandler(this, maxOutputs, this, false);
        } else return super.createExportItemHandler();
    }

    /**
     * Will only be called when the {@link SteamMetaTileEntity#workableHandler} as been instantiated so not risk
     * for a {@link NullPointerException}.
     */
    @SuppressWarnings(value = "ConstantConditions")
    @Override
    protected FluidTankList createExportFluidHandler() {
        int maxFluidOutputs = getRecipeMap().getMaxFluidOutputs();
        if (maxFluidOutputs == 0) return super.createExportFluidHandler();

        List<FluidTank> tanks = IntStream.of(maxFluidOutputs)
                .boxed()
                .map(i -> new FluidTank(tankCapacity))
                .collect(Collectors.toList());

        return new FluidTankList(false, tanks);
    }

    /**
     * Will only be called when the {@link SteamMetaTileEntity#workableHandler} as been instantiated so not risk
     * for a {@link NullPointerException}.
     */
    @SuppressWarnings(value = "ConstantConditions")
    @Override
    public FluidTankList createImportFluidHandler() {
        int maxFluidInputs = getRecipeMap().getMaxFluidInputs();
        if (maxFluidInputs == 0) return super.createImportFluidHandler();

        steamFluidTank = new FilteredFluidHandler(STEAM_CAPACITY).setFilter(CommonFluidFilters.STEAM);
        List<FluidTank> tanks = getRecipeMapInputFluidTanks(maxFluidInputs);

        tanks.add(steamFluidTank);
        return new FluidTankList(false, tanks);
    }

    /**
     * @return the tanks required by the recipemap. Used both to be appended with {@link #steamFluidTank} in order to
     *         {@link #createImportFluidHandler()} and to display the recipemap-related tanks but not the steam tank.
     */
    private List<FluidTank> getRecipeMapInputFluidTanks(int maxFluidInputs) {
        return IntStream.range(0, maxFluidInputs)
                .boxed()
                .map(i -> new FilteredFluidHandler(tankCapacity)
                        .setFilter(CommonFluidFilters.STEAM.negate()))
                .collect(Collectors.toList());
    }

    @Override
    public ModularUI createUI(EntityPlayer player) {
        int maxFluidInputs = getRecipeMap().getMaxFluidInputs();
        int yOffset = 0;
        if (maxFluidInputs >= 6 || getRecipeMap().getMaxInputs() >= 6 ||
                getRecipeMap().getMaxOutputs() >= 6 || getRecipeMap().getMaxFluidOutputs() >= 6) {
            yOffset = 9;
        }

        FluidTankList tanksToDisplay = new FluidTankList(false, getRecipeMapInputFluidTanks(maxFluidInputs));

        return getRecipeMap()
                .createUITemplate(getRecipeLogic()::getProgressPercent, importItems, exportItems, tanksToDisplay,
                        exportFluids,
                        yOffset)
                .widget(new LabelWidget(5, 5, getMetaFullName()))
                .bindPlayerInventory(player.inventory, GuiTextures.SLOT, yOffset)
                .build(getHolder(), player);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick() {
        super.randomDisplayTick();
        if (isActive() && GTValues.RNG.nextBoolean()) {
            VanillaParticleEffects.defaultFrontEffect(this, 0.5F, EnumParticleTypes.SMOKE_NORMAL);
        }
    }
}
