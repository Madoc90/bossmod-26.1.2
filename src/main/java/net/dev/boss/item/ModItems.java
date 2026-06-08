package net.dev.boss.item;

import net.dev.boss.BossMod;
import net.dev.boss.food.ModFoods;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BossMod.MOD_ID);

    public static final DeferredItem<Item> CURSED_INGOT = ITEMS.registerSimpleItem("cursed_ingot");

    public static final DeferredItem<Item> HERO_APPLE = ITEMS.registerItem("hero_apple",
            properties -> new Item(properties.food(ModFoods.HERO_APPLE, ModFoods.HERO_APPLE_CONSUMABLE)));

    public static final DeferredItem<Item> HERO_SWORD = ITEMS.registerItem("hero_sword",
            properties -> new Item(properties.sword(ModToolTiers.HERO, 4, -2.4f)));
    public static final DeferredItem<Item> HERO_PICKAXE = ITEMS.registerItem("hero_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.HERO, 2, -2.6f)));
    public static final DeferredItem<Item> HERO_SHOVEL = ITEMS.registerItem("hero_shovel",
            properties -> new ShovelItem(ModToolTiers.HERO, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> HERO_AXE = ITEMS.registerItem("hero_axe",
            properties -> new AxeItem(ModToolTiers.HERO, 5, -2.4f, properties));
    public static final DeferredItem<Item> HERO_HOE = ITEMS.registerItem("hero_hoe",
            properties -> new HoeItem(ModToolTiers.HERO, 0, -3.0f, properties));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
