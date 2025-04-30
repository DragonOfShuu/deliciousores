package dev.dragonofshuu.deliciousores.datagen.data.biomeModifiers;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.datagen.data.placements.DOOrePlacements;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.minecraft.world.level.levelgen.GenerationStep;

public class DOBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ORES = createKey("add_overworld_ores");

    public static void bootstrap(BootstrapContext<BiomeModifier> bootstrap) {
        HolderGetter<Biome> biomes = bootstrap.lookup(Registries.BIOME);
        var isOverworld = biomes.getOrThrow(Tags.Biomes.IS_OVERWORLD);

        HolderGetter<PlacedFeature> placedFeatures = bootstrap.lookup(Registries.PLACED_FEATURE);
        var oreFertileGravel = placedFeatures.getOrThrow(DOOrePlacements.ORE_FERTILE_GRAVEL);
        var oreCarrotite = placedFeatures.getOrThrow(DOOrePlacements.ORE_CARROTITE);
        var oreApplite = placedFeatures.getOrThrow(DOOrePlacements.ORE_APPLITE);

        var overworldFeatures = HolderSet.direct(oreFertileGravel, oreCarrotite, oreApplite);

        bootstrap.register(ADD_OVERWORLD_ORES,
            new BiomeModifiers.AddFeaturesBiomeModifier(
                isOverworld, 
                overworldFeatures, 
                GenerationStep.Decoration.UNDERGROUND_ORES
            )
        );
    }

    public static ResourceKey<BiomeModifier> createKey(String key) {
        return ResourceKey.create(
            NeoForgeRegistries.Keys.BIOME_MODIFIERS, 
            ResourceLocation.fromNamespaceAndPath(DeliciousOres.MODID, key) 
        );
    }
}
