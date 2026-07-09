package zyra.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import zyra.item.ModArmorMaterials;
import zyra.item.ModItems;
import zyra.block.ModBlocks;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            	blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
            	blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALE_CYRSTAL_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        	itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
            itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
            itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
            itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
            itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

            itemModelGenerator.register(ModItems.STEEL_SPEAR, Models.GENERATED);


            itemModelGenerator.registerArmor(ModItems.STEEL_HELMET, ModArmorMaterials.STEEL_INGOT_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
            itemModelGenerator.registerArmor(ModItems.STEEL_CHESTPLATE, ModArmorMaterials.STEEL_INGOT_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
            itemModelGenerator.registerArmor(ModItems.STEEL_LEGGINGS, ModArmorMaterials.STEEL_INGOT_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
            itemModelGenerator.registerArmor(ModItems.STEEL_BOOTS, ModArmorMaterials.STEEL_INGOT_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

    }



}

