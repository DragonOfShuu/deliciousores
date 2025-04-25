package dev.dragonofshuu.deliciousores.datagen.language;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DOLanguageProvider {
    public static String createTooltipKey(Item item) {
        return item.getDescriptionId() + ".tooltip";
    }

    public static String createTooltipKey(Block block) {
        return block.getDescriptionId() + ".tooltip";
    }
    
    /**
     * Create the tooltip with the type,
     * and the name
     * @param type item, block
     * @param name registry name of your block/item
     * @return
     */
    public static String createTooltipKey(String type, String name) {
        return type + "." +  DeliciousOres.MODID + "." + name + ".tooltip";
    }

    public static void addLanguageProviders(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();

        generator.addProvider(
            event.includeClient(), 
            new DOLanguageEnUsProvider(output)
        );
    }
}
