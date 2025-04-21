package dev.dragonofshuu.deliciousores.item;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DOItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DeliciousOres.MODID);
    
    private static final DOItemsUtil itemsUtil = new DOItemsUtil(ITEMS);

    public static IEventBus register(IEventBus bus) {
        ITEMS.register(bus);
        return bus;
    }
}
