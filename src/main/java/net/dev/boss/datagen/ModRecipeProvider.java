package net.dev.boss.datagen;

import net.dev.boss.block.ModBlocks;
import net.dev.boss.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "BossMod Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURSED_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CURSED_INGOT.get())
                .unlockedBy(getHasName(ModItems.CURSED_INGOT.get()), has(ModItems.CURSED_INGOT))
                .group("cursed")
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMONDINIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DIAMOND_INGOT.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_INGOT.get()), has(ModItems.DIAMOND_INGOT))
                .group("diamond")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.HERO_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.CURSED_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CURSED_INGOT.get()), has(ModItems.CURSED_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("cursed")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.HERO_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .define('A', ModItems.CURSED_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CURSED_INGOT.get()), has(ModItems.CURSED_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("cursed")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.HERO_AXE.get())
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .define('A', ModItems.CURSED_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CURSED_INGOT.get()), has(ModItems.CURSED_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("cursed")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.HERO_SHOVEL.get())
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .define('A', ModItems.CURSED_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CURSED_INGOT.get()), has(ModItems.CURSED_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("cursed")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.HERO_HOE.get())
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .define('A', ModItems.CURSED_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CURSED_INGOT.get()), has(ModItems.CURSED_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("cursed")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SWORD_OF_STEVE.get())
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .define('A', ModItems.DIAMOND_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.DIAMOND_INGOT.get()), has(ModItems.DIAMOND_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("diamond")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SWORD_OF_HEROBRINE.get())
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .define('A', ModItems.DIAMOND_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.DIAMOND_INGOT.get()), has(ModItems.DIAMOND_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("diamond")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.HERO_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.DIAMOND_INGOT.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_INGOT.get()), has(ModItems.DIAMOND_INGOT))
                .group("diamond")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.HERO_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DIAMOND_INGOT.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_INGOT.get()), has(ModItems.DIAMOND_INGOT))
                .group("diamond")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.HERO_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.DIAMOND_INGOT.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_INGOT.get()), has(ModItems.DIAMOND_INGOT))
                .group("diamond")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.HERO_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.DIAMOND_INGOT.get())
                .unlockedBy(getHasName(ModItems.DIAMOND_INGOT.get()), has(ModItems.DIAMOND_INGOT))
                .group("diamond")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.CURSED_INGOT.get(), 9)
                .requires(ModBlocks.CURSED_BLOCK)
                .unlockedBy(getHasName(ModBlocks.CURSED_BLOCK.get()), has(ModBlocks.CURSED_BLOCK))
                .group("cursed")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.DIAMOND_INGOT.get(), 9)
                .requires(ModBlocks.DIAMONDINIUM_BLOCK)
                .unlockedBy(getHasName(ModBlocks.DIAMONDINIUM_BLOCK.get()), has(ModBlocks.DIAMONDINIUM_BLOCK))
                .group("diamond")
                .save(output);
    }
}
