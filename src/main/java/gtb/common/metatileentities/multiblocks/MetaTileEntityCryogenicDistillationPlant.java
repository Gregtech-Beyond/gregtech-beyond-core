package gtb.common.metatileentities.multiblocks;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;

import gtb.api.metatileentity.multiblock.MetaTileEntityDefaultDistillationTower;
import gtb.api.recipes.GTBRecipeMaps;

public class MetaTileEntityCryogenicDistillationPlant extends MetaTileEntityDefaultDistillationTower {

    public MetaTileEntityCryogenicDistillationPlant(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTBRecipeMaps.CRYOGENIC_DISTILLATION_PLANT_RECIPES);
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.BLOWER_OVERLAY;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityCryogenicDistillationPlant(metaTileEntityId);
    }
}
