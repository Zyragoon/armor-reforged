package zyra.item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import zyra.armor_reforged.ArmorReforged;
import zyra.datagen.ModTags;

import java.util.EnumMap;

public class ModArmorMaterials {
    static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipmentasset"));
    public static final RegistryKey<EquipmentAsset> STEEL_INGOT_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(ArmorReforged.MOD_ID, "steel"));



    public static final ArmorMaterial STEEL_ARMOR_MATERIAL = new ArmorMaterial(20, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS,3);
        map.put(EquipmentType.LEGGINGS,6);
        map.put(EquipmentType.CHESTPLATE,7);
        map.put(EquipmentType.HELMET,3);
        map.put(EquipmentType.BODY,6);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f, 0f, ModTags.Items.STEEL_INGOT_REPAIR, STEEL_INGOT_KEY);



}


