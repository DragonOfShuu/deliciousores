package dev.dragonofshuu.deliciousores.block;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.item.DOItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DOBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DeliciousOres.MODID);
    private static final DOBlocksUtil BlocksUtil = new DOBlocksUtil(BLOCKS, DOItems.ITEMS);

    public static DeferredBlock<Block> FERTILE_GRAVEL = BlocksUtil.registerBlock("fertile_gravel", 
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL)));
    public static DeferredBlock<Block> CARROTITE_ORE = BlocksUtil.registerBlock("carrotite_ore", 
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL)));

    public static IEventBus register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        return modEventBus;
    }
}
