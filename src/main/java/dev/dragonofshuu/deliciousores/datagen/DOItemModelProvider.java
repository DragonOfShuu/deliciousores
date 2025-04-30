package dev.dragonofshuu.deliciousores.datagen;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.block.DOBlocks;
import dev.dragonofshuu.deliciousores.item.DOItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DOItemModelProvider extends ItemModelProvider {

    public DOItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DeliciousOres.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(DOBlocks.CARROTITE_ORE.get());
        simpleBlockItem(DOBlocks.APPLITE_ORE.get());
        simpleBlockItem(DOBlocks.FERTILE_GRAVEL.get());

        basicItem(DOItems.CARROTITE_INGOT.get());
        basicItem(DOItems.RAW_CARROTITE.get());
        basicItem(DOItems.RAW_APPLITE.get());
    }
    
}
