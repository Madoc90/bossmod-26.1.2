package net.dev.boss.tags;

import net.dev.boss.BossMod;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_HERO_TOOL = createTag("need_hero_tool");
        public static final TagKey<Block> INCORRECT_FOR_HERO_TOOL = createTag("incorrect_for_hero_tool");


    private static TagKey<Block> createTag(String name) {
        return BlockTags.create(Identifier.fromNamespaceAndPath(BossMod.MOD_ID, name));
    }
}

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> CURSED_REPAIRABLE = createTag("cursed_repairable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(BossMod.MOD_ID, name));
        }
    }
}
