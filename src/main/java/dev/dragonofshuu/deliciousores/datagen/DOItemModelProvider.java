package dev.dragonofshuu.deliciousores.datagen;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DOItemModelProvider extends ItemModelProvider {

    public DOItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DeliciousOres.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
    
}
