package gtb.api.utils;

import java.util.List;
import java.util.function.Consumer;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

import gregtech.api.util.TextComponentUtil;
import gregtech.api.util.TextFormattingUtil;

public class GTBMultiblockDisplayTextUtil {

    public static Consumer<List<ITextComponent>> addColorNumber(TextFormatting numberColor, int number,
                                                                TextFormatting textColor,
                                                                String translationKey) {
        return textList -> {
            ITextComponent numberFormated = TextComponentUtil.stringWithColor(numberColor,
                    TextFormattingUtil.formatNumbers(number));
            textList.add(TextComponentUtil.translationWithColor(textColor, translationKey, numberFormated));
        };
    }

    public static Consumer<List<ITextComponent>> addColorNumberCondition(TextFormatting numberColor, int number,
                                                                         TextFormatting textColor,
                                                                         String translationKey, boolean doDisplay) {
        return textList -> {
            if (doDisplay) addColorNumber(numberColor, number, textColor, translationKey).accept(textList);
        };
    }
}
