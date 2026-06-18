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
    public  static  final ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> CURSED_KEY = ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(BossMod.MOD_ID, "cursed"));

    public static final ArmorMaterial CURSED_ARMOR_MATERIAL = new ArmorMaterial(2300,
            makeDefense(5, 6, 9, 12, 16), 30, SoundEvents.ARMOR_EQUIP_NETHERITE,
            5f, 2f, ModTags.Items.CURSED_REPAIRABLE, CURSED_KEY);


    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }
}
