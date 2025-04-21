package dev.dragonofshuu.deliciousores.block;

import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import dev.dragonofshuu.deliciousores.block.custom.DescriptableBlockItem;

public class DOBlocksUtil {

    public final DeferredRegister.Blocks BLOCKS;
    public final DeferredRegister.Items ITEMS;

    public DOBlocksUtil(DeferredRegister.Blocks blocks, DeferredRegister.Items items) {
        BLOCKS = blocks;
        ITEMS = items;
    }

    public static StairBlock stair(Block baseBlock) {
        return new StairBlock(baseBlock.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    public <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, String descKey) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, descKey);
        return toReturn;
    }
    
    public <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    
    public <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    
    public <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block, Properties properties) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), properties));
    }

    public <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block, String descKey) {
        return ITEMS.register(name, () -> new DescriptableBlockItem(block.get(), new Item.Properties(), descKey));
    }

    public IEventBus register(IEventBus bus) {
        BLOCKS.register(bus);
        return bus;
    }
}
