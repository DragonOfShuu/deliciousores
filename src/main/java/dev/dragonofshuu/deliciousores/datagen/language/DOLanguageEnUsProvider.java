package dev.dragonofshuu.deliciousores.datagen.language;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.block.DOBlocks;
import dev.dragonofshuu.deliciousores.item.DOItems;
import net.minecraft.data.PackOutput;

public class DOLanguageEnUsProvider extends DOLanguageBaseProvider {
    public DOLanguageEnUsProvider(PackOutput output) {
        super(
            // Provided by the GatherDataEvent.
            output,
            // Your mod id.
            DeliciousOres.MODID,
            // The locale to use. You may use multiple language providers for different locales.
            "en_us"
        );
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.deliciousores", "Delicious Ores");

        add("tooltip.deliciousores.press_shift", "§5HOLD SHIFT");

        addBlock(DOBlocks.CARROTITE_ORE, "Carrotite Ore");
        addBlock(DOBlocks.APPLITE_ORE, "Applite Ore");
        addBlock(DOBlocks.FERTILE_GRAVEL, "Fertile Gravel");
    
        addItem(DOItems.CARROTITE_INGOT, "Carrotite Ingot");

        addItem(DOItems.RAW_CARROTITE, "Raw Carrotite");
        addItem(DOItems.RAW_APPLITE, "Raw Applite");
    }
}
