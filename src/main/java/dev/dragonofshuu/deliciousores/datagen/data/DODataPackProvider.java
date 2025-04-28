package dev.dragonofshuu.deliciousores.datagen.data;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.datagen.data.biomeModifiers.DOBiomeModifiers;
import dev.dragonofshuu.deliciousores.datagen.data.features.DOFeatures;
import dev.dragonofshuu.deliciousores.datagen.data.placements.DOPlacements;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class DODataPackProvider extends DatapackBuiltinEntriesProvider {
    public DODataPackProvider(PackOutput output, CompletableFuture<Provider> registries) {
		super(output, registries, getRegistries(), Set.of(DeliciousOres.MODID));
	}

    public static RegistrySetBuilder getRegistries() {
        return new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, DOFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, DOPlacements::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, DOBiomeModifiers::bootstrap);
    }
}
