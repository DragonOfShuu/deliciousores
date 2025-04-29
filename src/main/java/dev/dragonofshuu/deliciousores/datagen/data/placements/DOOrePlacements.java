package dev.dragonofshuu.deliciousores.datagen.data.placements;

import java.util.List;

import dev.dragonofshuu.deliciousores.datagen.data.features.DOOreFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class DOOrePlacements {
    public static ResourceKey<PlacedFeature> ORE_FERTILE_GRAVEL = DOPlacements.createKey("ore_fertile_gravel");
    public static ResourceKey<PlacedFeature> ORE_CARROTITE = DOPlacements.createKey("ore_carrotite");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        var fertileGravel = configuredGetter.getOrThrow(DOOreFeatures.ORE_FERTILE_GRAVEL);
        var carrotiteOre = configuredGetter.getOrThrow(DOOreFeatures.ORE_CARROTITE);

        DOPlacements.register(context, ORE_FERTILE_GRAVEL, fertileGravel, commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(120))));
        DOPlacements.register(context, ORE_CARROTITE, carrotiteOre, commonOrePlacement(200, HeightRangePlacement.uniform(VerticalAnchor.BOTTOM, VerticalAnchor.TOP)));
    }

    public static List<PlacementModifier> orePlacement(PlacementModifier countPlacement, PlacementModifier heightRange) {
        return List.of(countPlacement, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier heightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), heightRange);
    }
}
