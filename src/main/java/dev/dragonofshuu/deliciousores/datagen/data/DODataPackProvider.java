package dev.dragonofshuu.deliciousores.datagen.data;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.datagen.data.features.DOFeatures;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

public class DODataPackProvider extends DatapackBuiltinEntriesProvider {
    public DODataPackProvider(PackOutput output, CompletableFuture<Provider> registries) {
		super(output, registries, getRegistries(), Set.of(DeliciousOres.MODID));
	}

    public static RegistrySetBuilder getRegistries() {
        return new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, DOFeatures::bootstrap);
    }
}
