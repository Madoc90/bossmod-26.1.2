package net.dev.boss.item;

import com.google.common.collect.Maps;
import net.dev.boss.BossMod;
import net.dev.boss.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.Map;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> HERO_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(BossMod.MOD_ID, "hero"));
    public static final ResourceKey<EquipmentAsset> DEATH_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(BossMod.MOD_ID, "death"));
    public static final ResourceKey<EquipmentAsset> RELIC_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(BossMod.MOD_ID, "relic"));

    public static final ArmorMaterial HERO_ARMOR_MATERIAL = new ArmorMaterial(3800,
            makeDefense(5, 7, 10, 4, 17), 30, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3, 0.6f, ModTags.Items.DIAMOND_REPAIRABLE, HERO_KEY);

    public static final ArmorMaterial DEATH_ARMOR_MATERIAL = new ArmorMaterial(3800,
            makeDefense(6, 12, 10, 7, 20), 30, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3, 0.6f, ModTags.Items.DIAMOND_REPAIRABLE, DEATH_KEY);

    public static final ArmorMaterial RELIC_ARMOR_MATERIAL = new ArmorMaterial(4300,
            makeDefense(12, 30, 20, 8, 23), 30, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3, 0.6f, ModTags.Items.DIAMOND_REPAIRABLE, RELIC_KEY);


    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }
}
