package net.dev.boss.item;

import net.dev.boss.BossMod;
import net.dev.boss.food.ModFoods;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BossMod.MOD_ID);

    public static final DeferredItem<Item> CURSED_INGOT = ITEMS.registerSimpleItem("cursed_ingot");
    public static final DeferredItem<Item> DIAMOND_INGOT = ITEMS.registerSimpleItem("diamond_ingot");
    public static final DeferredItem<Item> HOLLOW_GEM = ITEMS.registerSimpleItem("hollow_gem");
    public static final DeferredItem<Item> RELIC_INGOT = ITEMS.registerSimpleItem("relic_ingot");

    public static final DeferredItem<Item> HERO_APPLE = ITEMS.registerItem("hero_apple",
            properties -> new Item(properties.food(ModFoods.HERO_APPLE, ModFoods.HERO_APPLE_CONSUMABLE)));
    public static final DeferredItem<Item> CURSED_BREAD = ITEMS.registerItem("cursed_bread",
            properties -> new Item(properties.food(ModFoods.CURSED_BREAD, ModFoods.CURSED_BREAD_CONSUMABLE)));

    public static final DeferredItem<Item> HERO_SWORD = ITEMS.registerItem("hero_sword",
            properties -> new Item(properties.sword(ModToolTiers.HERO, 4, -2.4f)));
    public static final DeferredItem<Item> SWORD_OF_STEVE = ITEMS.registerItem("sword_of_steve",
            properties -> new Item(properties.sword(ModToolTiers.STEVE, 4, -1.8f)));
    public static final DeferredItem<Item> SWORD_OF_HEROBRINE = ITEMS.registerItem("sword_of_herobrine",
            properties -> new Item(properties.sword(ModToolTiers.HEROBRINE, 10, -1.4f)));
    public static final DeferredItem<Item> HERO_PICKAXE = ITEMS.registerItem("hero_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.HERO, 2, -2.6f)));
    public static final DeferredItem<Item> HERO_SHOVEL = ITEMS.registerItem("hero_shovel",
            properties -> new ShovelItem(ModToolTiers.HERO, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> HERO_AXE = ITEMS.registerItem("hero_axe",
            properties -> new AxeItem(ModToolTiers.HERO, 5, -2.4f, properties));
    public static final DeferredItem<Item> HERO_HOE = ITEMS.registerItem("hero_hoe",
            properties -> new HoeItem(ModToolTiers.HERO, 0, -3.0f, properties));

    public static final DeferredItem<Item> HERO_HELMET = ITEMS.registerItem("hero_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.HERO_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> HERO_CHESTPLATE = ITEMS.registerItem("hero_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.HERO_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> HERO_LEGGINGS = ITEMS.registerItem("hero_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.HERO_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> HERO_BOOTS = ITEMS.registerItem("hero_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.HERO_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
