package gtb.common.metatileentities.multiblockpart;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.gui.ModularUI;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockAbilityPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityMultiblockPart;
import gtb.api.capabilities.GTBMultiblockAbilities;
import gtb.api.capabilities.GTBTileCapabilities;
import gtb.api.capabilities.IKevCooler;
import gtb.api.capabilities.KevContainer;
import gtb.api.render.GTBTextures;
import lombok.Getter;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static gtb.api.utils.GTBUtil.gtb;

public class MetaTileEntityKevCooler extends MetaTileEntityMultiblockPart
                                    implements IMultiblockAbilityPart<IKevCooler>, IKevCooler {

    private final Material material;
    @Getter
    private final int coolingAmount;

    public MetaTileEntityKevCooler(Material material, int coolingAmount) {
        this(gtb("kev_cooler." + material.getUnlocalizedName()), material, coolingAmount);
    }

    private MetaTileEntityKevCooler(ResourceLocation metaTileEntityId, Material material, int coolingAmount) {
        super(metaTileEntityId, 1);
        this.material = material;
        this.coolingAmount = coolingAmount;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityKevCooler(metaTileEntityId, material, coolingAmount);
    }

    @Override
    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return null;
    }

    @Override
    public void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline);
        GTBTextures.KEV_MULTIBLOCK_HATCH.render(renderState, translation, pipeline);
    }

    @Override
    public int getPaintingColorForRendering() {
        return this.material.getMaterialRGB();
    }

    @Override
    public MultiblockAbility<IKevCooler> getAbility() {
        return GTBMultiblockAbilities.KEV_COOLER;
    }

    @Override
    public void registerAbilities(List<IKevCooler> abilityList) {
        abilityList.add(this);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, @NotNull List<String> tooltip,
                               boolean advanced) {
        tooltip.add(I18n.format("gtb.machine.kev_cooler.cooling_amount", this.coolingAmount));
    }
}
