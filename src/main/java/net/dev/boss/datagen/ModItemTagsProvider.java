package net.dev.boss.datagen;

import net.dev.boss.BossMod;
import net.dev.boss.item.ModItems;
import net.dev.boss.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, BossMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Items.IRON_INGOT)
                .add(Items.REDSTONE)
                .add(Items.COPPER_INGOT)
                .add(ModItems.CURSED_INGOT.get())
                .add(ModItems.DIAMOND_INGOT.get())
                .add(ModItems.HOLLOW_GEM.get());

        tag(ModTags.Items.CURSED_REPAIRABLE)
                .add(ModItems.CURSED_INGOT.get());

        tag(ModTags.Items.DIAMOND_REPAIRABLE)
                .add(ModItems.DIAMOND_INGOT.get());

        tag(ItemTags.SWORDS).add(ModItems.HERO_SWORD.get());
        tag(ItemTags.PICKAXES).add(ModItems.HERO_PICKAXE.get());
        tag(ItemTags.AXES).add(ModItems.HERO_AXE.get());
        tag(ItemTags.SHOVELS).add(ModItems.HERO_SHOVEL.get());
        tag(ItemTags.HOES).add(ModItems.HERO_HOE.get());

        tag(ItemTags.SWORDS).add(ModItems.SWORD_OF_STEVE.get());

    }
}
