package dev.dragonofshuu.deliciousores.item;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DOItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DeliciousOres.MODID);
    private static final DOItemsUtil itemsUtil = new DOItemsUtil(ITEMS);
    
    public static DeferredItem<Item> RAW_CARROTITE = itemsUtil.registerItem("raw_carrotite", new Item.Properties().food(DOFoods.RAW_CARROTITE_FOOD));
    public static DeferredItem<Item> CARROTITE_INGOT = itemsUtil.registerItem("carrotite_ingot", new Item.Properties().food(DOFoods.CARROTITE_INGOT_FOOD));
    public static DeferredItem<Item> RAW_APPLITE = itemsUtil.registerItem("raw_applite", new Item.Properties().food(DOFoods.RAW_APPLITE_FOOD));

    public static IEventBus register(IEventBus bus) {
        ITEMS.register(bus);
        return bus;
    }
}
