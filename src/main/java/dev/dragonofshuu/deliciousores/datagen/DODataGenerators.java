package dev.dragonofshuu.deliciousores.datagen;

import java.util.concurrent.CompletableFuture;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.datagen.data.DODataPackProvider;
import dev.dragonofshuu.deliciousores.datagen.language.DOLanguageProvider;
import dev.dragonofshuu.deliciousores.datagen.tag.DOTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = DeliciousOres.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DODataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // SERVER
        generator.addProvider(
            event.includeServer(), 
            new DODataPackProvider(output, lookupProvider)
        );

        generator.addProvider(
            event.includeServer(), 
            new DORecipeProvider(output, lookupProvider)
        );

        generator.addProvider(
            event.includeServer(), 
            new DOLootTableProvider(output, lookupProvider)
        );

        DOTagsProvider.addTagProviders(event);
        
        // CLIENT
        DOLanguageProvider.addLanguageProviders(event);

        generator.addProvider(
            event.includeClient(),
            new DOBlockstateProvider(output, existingFileHelper)
        );
        
        generator.addProvider(
            event.includeClient(),
            new DOItemModelProvider(output, existingFileHelper)
        );
    }
}
