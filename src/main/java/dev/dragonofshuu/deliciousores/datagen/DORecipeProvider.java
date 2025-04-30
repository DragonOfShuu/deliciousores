package dev.dragonofshuu.deliciousores.datagen;

import java.util.concurrent.CompletableFuture;

import dev.dragonofshuu.deliciousores.item.DOItems;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

public class DORecipeProvider extends DORecipeProviderBase {

    public DORecipeProvider(PackOutput output, CompletableFuture<Provider> registries) {
        super(output, registries);
    }
    
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput, Provider holderLookup) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DOItems.RAW_CARROTITE), RecipeCategory.BUILDING_BLOCKS, DOItems.CARROTITE_INGOT, 0.1F, 200)
            .unlockedBy("has_smelts_to_carrotite", has(DOItems.RAW_CARROTITE))
            .save(recipeOutput);
    }
}
