package dev.dragonofshuu.deliciousores.datagen;

import java.util.concurrent.CompletableFuture;

import javax.annotation.Nullable;

// import dev.dragonofshuu.block.ModBlocks;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public class DORecipeProviderBase extends RecipeProvider {

    public DORecipeProviderBase(PackOutput output, CompletableFuture<Provider> registries) {
        super(output, registries);
    }
    
    /**
     * Cooked and baked by yours truly
     */
    public void stoneBasedBlockFamilyRecipes(
        RecipeOutput recipeOutput,
        String unlockName,
        ItemLike materialBase,
        @Nullable ItemLike stairs,
        @Nullable ItemLike slab,
        @Nullable ItemLike wall,
        @Nullable ItemLike fence,
        @Nullable ItemLike fenceGate,
        @Nullable ItemLike door,
        @Nullable ItemLike button,
        @Nullable ItemLike pressurePlate,
        @Nullable ItemLike trapdoor
    ) {
        if (stairs != null)
            stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, stairs, materialBase);
        if (slab != null)
            stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, slab, materialBase, 2);
        if (wall != null)
            stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, wall, materialBase);
            
        blockFamilyRecipes(
            recipeOutput, 
            unlockName, 
            materialBase, 
            stairs, 
            slab, 
            wall, 
            fence, 
            fenceGate, 
            door, 
            button, 
            pressurePlate, 
            trapdoor
        );
    }
        
    public void stoneBasedBlockFamilyRecipes(
        RecipeOutput recipeOutput,
        ItemLike materialBase,
        @Nullable ItemLike stairs,
        @Nullable ItemLike slab,
        @Nullable ItemLike wall,
        @Nullable ItemLike fence,
        @Nullable ItemLike fenceGate,
        @Nullable ItemLike door,
        @Nullable ItemLike button,
        @Nullable ItemLike pressurePlate,
        @Nullable ItemLike trapdoor
    ) {
        String unlockName = "has_" + materialBase.asItem().toString();
        stoneBasedBlockFamilyRecipes(
            recipeOutput, 
            unlockName,
            materialBase, 
            stairs, 
            slab, 
            wall, 
            fence, 
            fenceGate, 
            door, 
            button, 
            pressurePlate,
            trapdoor
        );
    }

    public void blockFamilyRecipes(
        RecipeOutput recipeOutput,
        String unlockName,
        ItemLike materialBase,
        @Nullable ItemLike stairs,
        @Nullable ItemLike slab,
        @Nullable ItemLike wall,
        @Nullable ItemLike fence,
        @Nullable ItemLike fenceGate,
        @Nullable ItemLike door,
        @Nullable ItemLike button,
        @Nullable ItemLike pressurePlate,
        @Nullable ItemLike trapdoor
    ) {
        if (stairs != null)
            stairBuilder(stairs, Ingredient.of(materialBase))
                .unlockedBy(unlockName, has(materialBase))
                .save(recipeOutput);

        if (slab != null)
            slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, slab, materialBase);
        
        if (wall != null)
            wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, wall, materialBase);

        if (fence != null) 
            fenceBuilder(fence, Ingredient.of(materialBase))
                .unlockedBy(unlockName, has(materialBase))
                .save(recipeOutput);
        
        if (fenceGate != null) 
            fenceGateBuilder(fenceGate, Ingredient.of(materialBase))
                .unlockedBy(unlockName, has(materialBase))
                .save(recipeOutput);
        
        if (door != null)
            doorBuilder(door, Ingredient.of(materialBase))
                .unlockedBy(unlockName, has(materialBase))
                .save(recipeOutput);
        
        if (button != null)
            buttonBuilder(button, Ingredient.of(materialBase))
                .unlockedBy(unlockName, has(materialBase))
                .save(recipeOutput);
        
        if (pressurePlate != null)
            pressurePlate(recipeOutput, pressurePlate, materialBase);
        
        if (trapdoor != null)
            trapdoorBuilder(trapdoor, Ingredient.of(materialBase))
                .unlockedBy(unlockName, has(materialBase))
                .save(recipeOutput);
    }

    public void blockFamilyRecipes(
        RecipeOutput recipeOutput,
        @Nullable ItemLike materialBase,
        @Nullable ItemLike stairs,
        @Nullable ItemLike slab,
        @Nullable ItemLike wall,
        @Nullable ItemLike fence,
        @Nullable ItemLike fenceGate,
        @Nullable ItemLike door,
        @Nullable ItemLike button,
        @Nullable ItemLike pressurePlate,
        @Nullable ItemLike trapdoor
    ) {
        blockFamilyRecipes(
            recipeOutput, 
            "has_" + materialBase.asItem().toString(), 
            materialBase, 
            stairs, 
            slab, 
            wall, 
            fence, 
            fenceGate, 
            door, 
            button, 
            pressurePlate,
            trapdoor
        );
    }
}
