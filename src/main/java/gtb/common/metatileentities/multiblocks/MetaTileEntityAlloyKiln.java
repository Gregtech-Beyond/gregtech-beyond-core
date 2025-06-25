package gtb.common.metatileentities.multiblocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.ModularUI;
import gregtech.api.gui.widgets.*;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityUIFactory;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapPrimitiveMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;

import codechicken.lib.raytracer.CuboidRayTraceResult;
import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gtb.api.recipes.GTBRecipeMaps;
import gtb.api.render.GTBTextures;
import gtb.common.block.GTBMetaBlocks;
import gtb.common.block.blocks.GTBMultiblockCasing2;

public class MetaTileEntityAlloyKiln extends RecipeMapPrimitiveMultiblockController {

    public MetaTileEntityAlloyKiln(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.ALLOY_KILN);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityAlloyKiln(metaTileEntityId);
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "XXX", "~X~")
                .aisle("XXX", "X~X", "~X~")
                .aisle("XXX", "XSX", "~X~")
                .where('X',
                        states(GTBMetaBlocks.GTB_MULTIBLOCK_CASING2
                                .getState(GTBMultiblockCasing2.CasingType.GALVANIZED_PORCELAIN_TILES))
                                        .or(autoAbilities()))
                .where('~', any())
                .where('S', selfPredicate())
                .build();
    }

    @Override
    protected ModularUI.Builder createUITemplate(EntityPlayer entityPlayer) {
        return ModularUI.builder(GuiTextures.BACKGROUND_STEAM.get(true), 176, 166)
                .shouldColor(false)

                .widget(new LabelWidget(5, 5, getMetaFullName()))
                .widget(new SlotWidget(importItems, 0, 52, 30, true, true)
                        .setBackgroundTexture(GuiTextures.SLOT_STEAM.get(true)))
                .widget(new SlotWidget(importItems, 1, 52, 48, true, true)
                        .setBackgroundTexture(GuiTextures.SLOT_STEAM.get(true)))

                .widget(new RecipeProgressWidget(recipeMapWorkable::getProgressPercent, 76, 41, 20, 15,
                        GuiTextures.PROGRESS_BAR_COMPRESS_STEAM.get(true), ProgressWidget.MoveType.HORIZONTAL,
                        GTBRecipeMaps.ALLOY_KILN))

                .widget(new SlotWidget(exportItems, 0, 103, 30, true, false)
                        .setBackgroundTexture(GuiTextures.SLOT_STEAM.get(true)))
                .widget(new SlotWidget(exportItems, 1, 103, 48, true, false)
                        .setBackgroundTexture(GuiTextures.SLOT_STEAM.get(true)))

                .widget(new TankWidget(importFluids.getTankAt(0), 10, 22, 20, 58)
                        .setBackgroundTexture(GuiTextures.PROGRESS_BAR_BOILER_EMPTY.get(true))
                        .setContainerClicking(true, true))

                .bindPlayerInventory(entityPlayer.inventory, GuiTextures.SLOT_STEAM.get(true), 0);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return GTBTextures.PORCELAIN_TILES;
    }

    @SideOnly(Side.CLIENT)
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY;
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        getFrontOverlay().renderOrientedState(renderState, translation, pipeline, getFrontFacing(),
                recipeMapWorkable.isActive(), recipeMapWorkable.isWorkingEnabled());
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Override
    public boolean onRightClick(EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
                                CuboidRayTraceResult hitResult) {
        // try to fill a bucket (or similar) with creosote on right click (if not sneaking)
        if (playerIn.getHeldItem(hand).hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null)) {
            if (!playerIn.isSneaking()) {
                return getWorld().isRemote || FluidUtil.interactWithFluidHandler(playerIn, hand, getFluidInventory());
            } else {
                // allow opening UI on shift-right-click with fluid container item
                if (getWorld() != null && !getWorld().isRemote) {
                    MetaTileEntityUIFactory.INSTANCE.openUI(getHolder(), (EntityPlayerMP) playerIn);
                }
                return true;
            }
        }
        return super.onRightClick(playerIn, hand, facing, hitResult);
    }
}
