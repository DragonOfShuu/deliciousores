package dev.dragonofshuu.deliciousores.item;

import java.util.function.Supplier;

import dev.dragonofshuu.deliciousores.item.custom.DescriptableItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DOItemsUtil {

    public final DeferredRegister.Items ITEMS;

    public DOItemsUtil(DeferredRegister.Items items) {
        ITEMS = items;
    }

    public DeferredItem<Item> registerItem(String name, Properties properties, String descKey) {
        return registerItem(name, properties, descKey, true);
    }

    public DeferredItem<Item> registerItem(String name, Properties properties, String descKey, boolean requiresShift) {
        DeferredItem<Item> itemToReturn = registerItem(name, () -> new DescriptableItem(properties, descKey));
        return itemToReturn;
    }
    
    public DeferredItem<Item> registerItem(String name, Properties properties) {
        return ITEMS.register(name, () -> new Item(properties));
    }
    
    public <T extends Item> DeferredItem<T> registerItem(String name, Supplier<T> item) {
        DeferredItem<T> itemToReturn = ITEMS.register(name, item);
        return itemToReturn;
    }

    public IEventBus register(IEventBus bus) {
        ITEMS.register(bus);
        return bus;
    }
}
