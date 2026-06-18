package net.dev.boss.datagen;

import net.dev.boss.block.ModBlocks;
import net.dev.boss.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.CURSED_BLOCK.get());

        add(ModBlocks.CURSED_ORE.get(),
                createOreDrop(ModBlocks.CURSED_ORE.get(), ModItems.CURSED_INGOT.get()));

        add(ModBlocks.DIAMONDINIUM_ORE.get(),
                createOreDrop(ModBlocks.DIAMONDINIUM_ORE.get(), ModItems.DIAMOND_INGOT.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
