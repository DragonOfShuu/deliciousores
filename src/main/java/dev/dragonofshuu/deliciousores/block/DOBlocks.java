package dev.dragonofshuu.deliciousores.block;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.item.DOItems;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DOBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DeliciousOres.MODID);
    private static final DOBlocksUtil BlocksUtil = new DOBlocksUtil(BLOCKS, DOItems.ITEMS);

    public static DeferredBlock<Block> FERTILE_GRAVEL = BlocksUtil.registerBlock("fertile_gravel", 
        () -> new ColoredFallingBlock(new ColorRGBA(-8356741), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL)));
    public static DeferredBlock<Block> CARROTITE_ORE = BlocksUtil.registerBlock("carrotite_ore", 
        () -> new ColoredFallingBlock(new ColorRGBA(-8356741), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL).pushReaction(PushReaction.DESTROY)));
    public static DeferredBlock<Block> APPLITE_ORE = BlocksUtil.registerBlock("applite_ore", 
        () -> new ColoredFallingBlock(new ColorRGBA(-8356741), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL).pushReaction(PushReaction.DESTROY)));

    public static IEventBus register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        return modEventBus;
    }
}
