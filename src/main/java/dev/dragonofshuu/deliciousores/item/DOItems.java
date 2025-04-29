package dev.dragonofshuu.deliciousores.item;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DOItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DeliciousOres.MODID);
    private static final DOItemsUtil itemsUtil = new DOItemsUtil(ITEMS);
    
    public static DeferredItem<Item> RAW_CARROTITE = itemsUtil.registerItem("raw_carrotite", new Item.Properties().food(DOFoods.CARROTITE_FOOD));

    public static IEventBus register(IEventBus bus) {
        ITEMS.register(bus);
        return bus;
    }
}
