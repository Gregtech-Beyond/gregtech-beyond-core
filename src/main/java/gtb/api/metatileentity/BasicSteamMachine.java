package gtb.api.metatileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;

import org.jetbrains.annotations.NotNull;

import gregtech.api.GTValues;
import gregtech.api.capability.impl.NotifiableItemStackHandler;
import gregtech.api.gui.ModularUI;
import gregtech.api.gui.widgets.LabelWidget;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.SteamMetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.recipes.RecipeMap;
import gregtech.client.particle.VanillaParticleEffects;
import gregtech.client.renderer.texture.Textures;

import gtb.api.utils.GTBUtil;

public class BasicSteamMachine extends SteamMetaTileEntity {

    public static BasicSteamMachine addSteamMachine(String machineName, boolean isHighPressure,
                                                    @NotNull RecipeMap<?> recipeMap) {
        return new BasicSteamMachine(GTBUtil.gtb(machineName), isHighPressure, recipeMap);
    }

    protected BasicSteamMachine(ResourceLocation metaTileEntityId, boolean isHighPressure,
                                @NotNull RecipeMap<?> recipeMap) {
        super(metaTileEntityId, recipeMap, Textures.ALLOY_SMELTER_OVERLAY, isHighPressure);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new BasicSteamMachine(metaTileEntityId, isHighPressure, getRecipeMap());
    }

    @Override
    protected IItemHandlerModifiable createImportItemHandler() {
        if (getRecipeMap() != null) {
            int maxInputs = getRecipeMap().getMaxInputs();
            if (maxInputs > 0) {
                return new NotifiableItemStackHandler(this, maxInputs, this, false);
            }
        }
        return new ItemStackHandler();
    }

    @Override
    protected IItemHandlerModifiable createExportItemHandler() {
        if (getRecipeMap() != null) {
            int maxOutputs = getRecipeMap().getMaxOutputs();
            if (maxOutputs > 0) {
                return new NotifiableItemStackHandler(this, maxOutputs, this, false);
            }
        }
        return new ItemStackHandler();
    }

    @Override
    public ModularUI createUI(EntityPlayer player) {
        int yOffset = 0;
        if (getRecipeMap().getMaxInputs() >= 6 || getRecipeMap().getMaxFluidInputs() >= 6 ||
                getRecipeMap().getMaxOutputs() >= 6 || getRecipeMap().getMaxFluidOutputs() >= 6) {
            yOffset = 9;
        }

        return getRecipeMap()
                .createUITemplate(getRecipeLogic()::getProgressPercent, importItems, exportItems, importFluids,
                        exportFluids,
                        yOffset)
                .widget(new LabelWidget(5, 5, getMetaFullName()))
                .bindPlayerInventory(player.inventory)
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
