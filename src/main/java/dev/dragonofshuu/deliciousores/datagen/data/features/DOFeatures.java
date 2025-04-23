package dev.dragonofshuu.deliciousores.datagen.data.features;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class DOFeatures extends FeatureUtils {
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        DOOreFeatures.bootstrap(context);
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(
            Registries.CONFIGURED_FEATURE, 
            ResourceLocation.fromNamespaceAndPath(DeliciousOres.MODID, name)
        );
    }
}
