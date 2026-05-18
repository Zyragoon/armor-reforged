package zyra.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import zyra.armor_reforged.ArmorReforged;

import java.util.function.Function;

public class ModItems {

    public static Item STEEL_INGOT = register("steel_ingot", Item::new, new Item.Settings());
    public static Item STEEL_NUGGET = register("steel_nugget", Item::new, new Item.Settings());
    public static Item STEEL_SWORD = register("steel_sword", Item::new, new Item.Settings());
    public static Item STEEL_PICKAXE = register("steel_pickaxe", Item::new, new Item.Settings());
    public static Item STEEL_AXE = register("steel_axe", Item::new, new Item.Settings());
    public static Item STEEL_SHOVEL = register("steel_shovel", Item::new, new Item.Settings());
    public static Item STEEL_HOE = register("steel_hoe", Item::new, new Item.Settings());
    public static Item STEEL_HELMET = register("steel_helmet", Item::new, new Item.Settings());
    public static Item STEEL_CHESTPLATE = register("steel_chestplate", Item::new, new Item.Settings());
    public static Item STEEL_LEGGINGS = register("steel_leggings", Item::new, new Item.Settings());
    public static Item STEEL_BOOTS = register("steel_boots", Item::new, new Item.Settings());
    public static Item STEEL_SPEAR = register("steel_spear", Item::new, new Item.Settings());


    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ArmorReforged.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }
    public static void initialize() {
      ArmorReforged.LOGGER.info("Registering items for " + ArmorReforged.MOD_ID);
    }
}
