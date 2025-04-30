package dev.dragonofshuu.deliciousores.datagen.data.features;

import dev.dragonofshuu.deliciousores.block.DOBlocks;
import dev.dragonofshuu.deliciousores.common.DOTags;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class DOOreFeatures {
    public static ResourceKey<ConfiguredFeature<?, ?>> ORE_FERTILE_GRAVEL = DOFeatures.createKey("ore_fertile_gravel");
    public static ResourceKey<ConfiguredFeature<?, ?>> ORE_CARROTITE = DOFeatures.createKey("ore_carrotite");
    public static ResourceKey<ConfiguredFeature<?, ?>> ORE_APPLITE = DOFeatures.createKey("ore_applite");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneTarget = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        RuleTest farmableOreTarget = new TagMatchTest(DOTags.Blocks.FARMABLE_ORE_REPLACEABLE);
        DOFeatures.register(context, ORE_FERTILE_GRAVEL, Feature.ORE, new OreConfiguration(stoneTarget, DOBlocks.FERTILE_GRAVEL.get().defaultBlockState(), 60, 0));   
        DOFeatures.register(context, ORE_CARROTITE, Feature.ORE, new OreConfiguration(farmableOreTarget, DOBlocks.CARROTITE_ORE.get().defaultBlockState(), 10, 0.3f));
        DOFeatures.register(context, ORE_APPLITE, Feature.ORE, new OreConfiguration(farmableOreTarget, DOBlocks.APPLITE_ORE.get().defaultBlockState(), 10, 0.3f));
    }
}
