package dev.dragonofshuu.deliciousores.datagen.tag;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DOBlockTagsProvider extends BlockTagsProvider {

    public DOBlockTagsProvider(PackOutput output, CompletableFuture<Provider> lookupProvider,
            @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DeliciousOres.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(Provider provider) {
        this.tag(BlockTags.NEEDS_STONE_TOOL);
            
        this.tag(BlockTags.NEEDS_IRON_TOOL);
            
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE);
        
        this.tag(BlockTags.FENCES);
            
        this.tag(BlockTags.FENCE_GATES);
        
        this.tag(BlockTags.WALLS);

        this.tag(Tags.Blocks.ORES);
            
        this.tag(Tags.Blocks.ORES_IN_GROUND_STONE);

        this.tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE);
        
        this.tag(BlockTags.LUSH_GROUND_REPLACEABLE);
            
        this.tag(BlockTags.AZALEA_ROOT_REPLACEABLE);
            
        this.tag(BlockTags.MOSS_REPLACEABLE);
            
        this.tag(BlockTags.DRIPSTONE_REPLACEABLE);
            
        this.tag(BlockTags.SCULK_REPLACEABLE);
        
        this.tag(BlockTags.REPLACEABLE);
        
        this.tag(BlockTags.CAVE_VINES);
    }
}
