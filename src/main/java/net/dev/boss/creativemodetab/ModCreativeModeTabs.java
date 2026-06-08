package net.dev.boss.creativemodetab;

import net.dev.boss.BossMod;
import net.dev.boss.block.ModBlocks;
import net.dev.boss.food.ModFoods;
import net.dev.boss.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BossMod.MOD_ID);

    public static final Supplier<CreativeModeTab> CURSED_ITEMS = CREATIVE_MODE_TABS.register("cursed_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CURSED_INGOT.get()))
                    .title(Component.translatable("creativetab.bossmod.cursed_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CURSED_INGOT);



                    }).build());


    public static final Supplier<CreativeModeTab> CURSED_BLOCKS = CREATIVE_MODE_TABS.register("cursed_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CURSED_BLOCK.get()))
                    .title(Component.translatable("creativetab.bossmod.cursed_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CURSED_BLOCK);
                        output.accept(ModBlocks.CURSED_ORE);



                    }).build());

    public static final Supplier<CreativeModeTab> FOODS = CREATIVE_MODE_TABS.register("foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HERO_APPLE.get()))
                    .title(Component.translatable("creativetab.bossmod.foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HERO_APPLE);



                    }).build());

    public static final Supplier<CreativeModeTab> TOOLS = CREATIVE_MODE_TABS.register("tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HERO_SWORD.get()))
                    .title(Component.translatable("creativetab.bossmod.tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HERO_SWORD);
                        output.accept(ModItems.HERO_PICKAXE);
                        output.accept(ModItems.HERO_AXE);
                        output.accept(ModItems.HERO_SHOVEL);
                        output.accept(ModItems.HERO_HOE);



                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
