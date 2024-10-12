package dev.nobleskye.skyecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class ModBlocks {
    public static final Block MAGIC_BLOCK = new MagicBlock(FabricBlockSettings.of(Material.STONE));

    public static void registerBlocks() {
        registerBlock("magic_block", MAGIC_BLOCK);
    }

    private static void registerBlock(String name, Block block) {
        Registry.register(Registry.BLOCK, new Identifier("skyecraft", name), block);
        Registry.register(Registry.ITEM, new Identifier("skyecraft", name), new BlockItem(block, new Item.Settings()));
    }
}