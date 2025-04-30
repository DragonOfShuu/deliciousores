package dev.dragonofshuu.deliciousores.datagen.loot;

import dev.dragonofshuu.deliciousores.block.DOBlocks;
import dev.dragonofshuu.deliciousores.item.DOItems;
import net.minecraft.core.HolderLookup;

public class DOBlockLootProvider extends DOBlockLootProviderBase {

    public DOBlockLootProvider(HolderLookup.Provider lookupProvider) {
        super(lookupProvider);
    }

    @Override
    protected void generate() {
        add(DOBlocks.CARROTITE_ORE.get(), block -> createOreDrop(block, DOItems.RAW_CARROTITE.get()));
        add(DOBlocks.APPLITE_ORE.get(), block -> createOreDrop(block, DOItems.RAW_APPLITE.get()));
        
        dropSelf(DOBlocks.FERTILE_GRAVEL.get());
    }
    
}
