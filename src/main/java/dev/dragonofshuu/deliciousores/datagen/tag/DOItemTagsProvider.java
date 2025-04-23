package dev.dragonofshuu.deliciousores.datagen.tag;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;

public class DOItemTagsProvider extends ItemTagsProvider {
    public DOItemTagsProvider(PackOutput output, CompletableFuture<Provider> lookupProvider,
            CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags);
    }

    @Override
    protected void addTags(Provider provider) {

    }
    
}
