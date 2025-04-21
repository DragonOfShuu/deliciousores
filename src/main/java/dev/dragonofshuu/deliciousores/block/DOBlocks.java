package dev.dragonofshuu.deliciousores.block;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.item.DOItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DOBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DeliciousOres.MODID);
    
    private static final DOBlocksUtil BlocksUtil = new DOBlocksUtil(BLOCKS, DOItems.ITEMS);

    public static IEventBus register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        return modEventBus;
    }
}
