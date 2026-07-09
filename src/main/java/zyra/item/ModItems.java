package zyra.item;

import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import zyra.armor_reforged.ArmorReforged;

import java.util.function.Function;

import static net.minecraft.item.Items.register;

public class ModItems {

    public static Item STEEL_INGOT = register("steel_ingot", Item::new, new Item.Settings());
    public static Item STEEL_NUGGET = register("steel_nugget", Item::new, new Item.Settings());
    public static Item STEEL_SWORD = register("steel_sword", Item::new, new Item.Settings());
    public static Item STEEL_PICKAXE = register("steel_pickaxe", Item::new, new Item.Settings());
    public static Item STEEL_AXE = register("steel_axe", Item::new, new Item.Settings());
    public static Item STEEL_SHOVEL = register("steel_shovel", Item::new, new Item.Settings());
    public static Item STEEL_HOE = register("steel_hoe", Item::new, new Item.Settings());
    public static Item STEEL_SPEAR = register("steel_spear", Item::new, new Item.Settings());



   public static final Item STEEL_HELMET = registerItem("steel_helmet",
           setting -> new Item (setting.armor(ModArmorMaterials.STEEL_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            setting -> new Item(setting.armor(ModArmorMaterials.STEEL_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            setting -> new Item(setting.armor(ModArmorMaterials.STEEL_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            setting -> new Item(setting.armor(ModArmorMaterials.STEEL_ARMOR_MATERIAL, EquipmentType.BOOTS)));


   private static Item registerItem(String name, Function<Item.Settings, Item> function){
       return Registry.register(Registries.ITEM,Identifier.of(ArmorReforged.MOD_ID, name),
               function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ArmorReforged.MOD_ID, name)))));


    }
    public static void initialize() {
        ArmorReforged.LOGGER.info("Registering items for " + ArmorReforged.MOD_ID);
    }
}
