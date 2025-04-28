package dev.dragonofshuu.deliciousores.common;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DOTags {
    public static class Blocks {
        public static final TagKey<Block> FARMABLE_ORE_REPLACEABLE = tag("farmable_ore_replaceable");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(DeliciousOres.MODID, name));
        }
    }    
}
