package gtb.mixins.gregtech;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import gregtech.api.metatileentity.multiblock.RecipeMapPrimitiveMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMap;
import gregtech.client.utils.TooltipHelper;
import gregtech.common.blocks.*;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.common.metatileentities.multi.MetaTileEntityCokeOven;

@Mixin(value = MetaTileEntityCokeOven.class, remap = false)
public abstract class MixinCokeOvenStructure extends RecipeMapPrimitiveMultiblockController {

    public MixinCokeOvenStructure(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap) {
        super(metaTileEntityId, recipeMap);
    }

    @Shadow
    protected abstract IBlockState getCasingState();

    @Inject(method = "createStructurePattern", at = @At(value = "RETURN", ordinal = 0), cancellable = true)
    public void editStructurePattern(CallbackInfoReturnable<BlockPattern> cir) {
        cir.setReturnValue(
                FactoryBlockPattern.start()
                        .aisle(" XXX ", " XZX ", " XZX ", "  X  ", "     ")
                        .aisle("XXXXX", "X   X", "X   X", " X X ", "  X  ")
                        .aisle("XXZXX", "Z   Z", "Z   Z", "X   X", " XZX ")
                        .aisle("XXXXX", "X   X", "X   X", " X X ", "  X  ")
                        .aisle(" XXX ", " XYX ", " XZX ", "  X  ", "     ")
                        .where('Z', states(getCasingState()).setMinGlobalLimited(4)
                                .or(metaTileEntities(MetaTileEntities.COKE_OVEN_HATCH)))
                        .where('X', states(getCasingState()))
                        .where(' ', air())
                        .where('Y', this.selfPredicate())
                        .build());
    }

    /**
     * Tooltips to help the player finding accepted positions for the hatches.
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World world, @NotNull List<String> tooltip,
                               boolean advanced) {
        if (TooltipHelper.isCtrlDown()) {
            tooltip.add(I18n.format("gtb.multiblock.coke_oven.hatch_position.tooltip"));
        } else {
            tooltip.add(I18n.format("gtb.multiblock.coke_oven.hatch_position.tooltip.hold_ctrl"));
        }
    }
}
