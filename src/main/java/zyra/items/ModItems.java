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
