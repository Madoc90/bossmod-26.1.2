package net.dev.boss.datagen;

import net.dev.boss.BossMod;
import net.dev.boss.block.ModBlocks;
import net.dev.boss.item.ModArmorMaterials;
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
        itemModels.generateFlatItem(ModItems.DIAMOND_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CURSED_BREAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.HOLLOW_GEM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RELIC_INGOT.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.HERO_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SWORD_OF_STEVE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SWORD_OF_HEROBRINE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.HERO_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateTrimmableItem(ModItems.HERO_HELMET.get(), ModArmorMaterials.HERO_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.HERO_CHESTPLATE.get(), ModArmorMaterials.HERO_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(ModItems.HERO_LEGGINGS.get(), ModArmorMaterials.HERO_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(ModItems.HERO_BOOTS.get(), ModArmorMaterials.HERO_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModels.generateTrimmableItem(ModItems.DEATH_HELMET.get(), ModArmorMaterials.DEATH_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.DEATH_CHESTPLATE.get(), ModArmorMaterials.DEATH_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(ModItems.DEATH_LEGGINGS.get(), ModArmorMaterials.DEATH_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(ModItems.DEATH_BOOTS.get(), ModArmorMaterials.DEATH_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);


        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.CURSED_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CURSED_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DIAMONDINIUM_ORE.get());
        blockModels.createTrivialCube(ModBlocks.HOLLOWSTONE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DIAMONDINIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RELIC_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RELIC_ORE.get());
    }
}
