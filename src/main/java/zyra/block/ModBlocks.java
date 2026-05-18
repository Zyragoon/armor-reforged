package zyra.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import zyra.armor_reforged.ArmorReforged;

import java.util.function.Function;

public class ModBlocks {
    public static final Block STEEL_BLOCK = register("steel_block", Block::new, Block.Settings.create().strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block PALE_CYRSTAL_BLOCK = register("pale_crystal_block", Block::new, Block.Settings.create().strength(3.0f).requiresTool().sounds(BlockSoundGroup.GLASS));


    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(ArmorReforged.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }
    public static void initialize() {
        ArmorReforged.LOGGER.info("Registering blocks for " + ArmorReforged.MOD_ID);
    }
}