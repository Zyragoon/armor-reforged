package zyra.datagen;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import zyra.armor_reforged.ArmorReforged;

import static net.minecraft.registry.tag.TagEntry.createTag;

public class ModTags {
    public static class Blocks {

    }


    public static class Items {
        public static  final TagKey<Item> STEEL_INGOT_REPAIR = createTag("steel_ingot_repair");
    }

    private static TagKey<Item> createTag(String name){
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(ArmorReforged.MOD_ID, name));
    }

}
