package net.dev.boss.datagen;

import net.dev.boss.BossMod;
import net.dev.boss.block.ModBlocks;
import net.dev.boss.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, BossMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.CURSED_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_APPLE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.HERO_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);


        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.CURSED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CURSED_ORE.get());
    }
}
