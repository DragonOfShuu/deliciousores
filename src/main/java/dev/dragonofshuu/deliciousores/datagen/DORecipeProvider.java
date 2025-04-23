package dev.dragonofshuu.deliciousores.datagen;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;

public class DORecipeProvider extends DORecipeProviderBase {

    public DORecipeProvider(PackOutput output, CompletableFuture<Provider> registries) {
        super(output, registries);
    }
    
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput, Provider holderLookup) {
        
    }
}
