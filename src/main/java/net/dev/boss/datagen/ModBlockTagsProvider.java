package net.dev.boss.datagen;

import net.dev.boss.BossMod;
import net.dev.boss.block.ModBlocks;
import net.dev.boss.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, BossMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CURSED_BLOCK.get())
                .add(ModBlocks.CURSED_ORE.get())
                .add(ModBlocks.DIAMONDINIUM_ORE.get());

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.CURSED_ORE.get())
                .add(ModBlocks.DIAMONDINIUM_ORE.get());

        tag(ModTags.Blocks.NEEDS_HERO_TOOL)
                .add(ModBlocks.CURSED_BLOCK.get())
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_HERO_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_HERO_TOOL);


    }
}
