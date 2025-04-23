package dev.dragonofshuu.deliciousores.datagen;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import dev.dragonofshuu.deliciousores.datagen.loot.DOBlockLootProvider;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class DOLootTableProvider extends LootTableProvider {

    public DOLootTableProvider(PackOutput output, CompletableFuture<Provider> registries) {
        super(output, Set.of(), List.of(
            new SubProviderEntry(
                DOBlockLootProvider::new, LootContextParamSets.BLOCK
            )
        ), registries);
    }
    
}
