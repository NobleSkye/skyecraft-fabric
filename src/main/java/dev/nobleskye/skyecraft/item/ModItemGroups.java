package dev.nobleskye.skyecraft.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import dev.nobleskye.skyecraft.SkyeCraft;
import dev.nobleskye.skyecraft.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SkyeCraft.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.skyecraft.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SkyeCraft.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.skyecraft.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                    }).build());

    public static final ItemGroup DOORS_REMAKE = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SkyeCraft.MOD_ID, "lighter"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LIGHTER))
                    .displayName(Text.translatable("itemgroup.skyecraft.doors_remake"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LIGHTER);
                        entries.add(ModItems.LOCK_PICK);
                    }).build());


    public static final ItemGroup MCD_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SkyeCraft.MOD_ID, "mcd_truthseeker"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MCD_SWORD))
                    .displayName(Text.translatable("itemgroup.skyecraft.mcd_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MCD_HEARTSTEALER);
                        entries.add(ModItems.MCD_RAPIER);
                        entries.add(ModItems.MCD_TRUTHSEEKER);
                        entries.add(ModItems.MCD_SWORD);
                        entries.add(ModItems.MCD_UNNAMED_BLADE);
                    }).build());






    public static void registerItemGroups() {
        SkyeCraft.LOGGER.info("Registering Item Groups for " + SkyeCraft.MOD_ID);
    }
}

