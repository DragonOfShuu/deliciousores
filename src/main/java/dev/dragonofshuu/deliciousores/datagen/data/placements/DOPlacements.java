package dev.dragonofshuu.deliciousores.datagen.data.placements;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class DOPlacements extends PlacementUtils {
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        DOOrePlacements.bootstrap(context);
    }

    public static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(DeliciousOres.MODID, name));
    }
}
