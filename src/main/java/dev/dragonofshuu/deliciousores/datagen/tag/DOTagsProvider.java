package dev.dragonofshuu.deliciousores.datagen.tag;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DOTagsProvider {
    public static void addTagProviders(GatherDataEvent event) {
        // Boilerplate
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        
        DOBlockTagsProvider blockTagsProvider = generator.addProvider(
            event.includeServer(), 
            new DOBlockTagsProvider(output, lookupProvider, existingFileHelper)
        );

        generator.addProvider(
            event.includeServer(), 
            new DOItemTagsProvider(output, lookupProvider, blockTagsProvider.contentsGetter())
        );
    }
}
