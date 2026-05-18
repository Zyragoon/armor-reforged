package zyra.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import zyra.items.ModItems;
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
            itemModelGenerator.register(ModItems.STEEL_SWORD, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_AXE, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_HOE, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_HELMET, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_CHESTPLATE, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_LEGGINGS, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_BOOTS, Models.GENERATED);
            itemModelGenerator.register(ModItems.STEEL_SPEAR, Models.GENERATED);
            
    }



}

