package dev.dragonofshuu.deliciousores.datagen.loot;

import java.util.Set;

import dev.dragonofshuu.deliciousores.block.DOBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

public abstract class DOBlockLootProviderBase extends BlockLootSubProvider {

    private final DeferredRegister.Blocks KNOWN_BLOCKS;

    public DOBlockLootProviderBase(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
        KNOWN_BLOCKS = DOBlocks.BLOCKS;
    }

    public DOBlockLootProviderBase(HolderLookup.Provider lookupProvider, DeferredRegister.Blocks known_blocks) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
        KNOWN_BLOCKS = known_blocks;
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return KNOWN_BLOCKS.getEntries()
            .stream()
            .map(e -> (Block) e.value())
            .toList();
    }

    public void dropSlab(Block block) {
        add(block, newBlock -> createSlabItemTable(newBlock));
    }

    public void dropDoor(Block block) {
        add(block, newBlock -> createDoorTable(newBlock));
    }
}
