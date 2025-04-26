package dev.dragonofshuu.deliciousores.datagen;

import dev.dragonofshuu.deliciousores.DeliciousOres;
import dev.dragonofshuu.deliciousores.block.DOBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DOBlockstateProvider extends BlockStateProvider {

    public DOBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DeliciousOres.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(DOBlocks.CARROTITE_ORE.get());
        simpleBlock(DOBlocks.FERTILE_GRAVEL.get());
    }
}
