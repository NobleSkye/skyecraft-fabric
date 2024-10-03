package dev.nobleskye.skyecraft.item;

import dev.nobleskye.skyecraft.SkyeCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModSwords {
    // Sword items
    public static final Item MCD_TRUTHSEEKER = registerItem("mcd_truthseeker", new SwordItem(GuiditeMaterial.INSTANCE, new Item.Settings().group(ItemGroup.COMBAT)));

//    public static final Item MCD_RAPIER = registerItem("mcd_rapier", new SwordItem(GuiditeMaterial.INSTANCE, 5, -1.6F, new Item.Settings()));
//    public static final Item MCD_HEARTSTEALER = registerItem("mcd_heartstealer", new SwordItem(GuiditeMaterial.INSTANCE, 8, -2.2F, new Item.Settings()));
//    public static final Item MCD_SWORD = registerItem("mcd_sword", new SwordItem(GuiditeMaterial.INSTANCE, 6, -2.4F, new Item.Settings()));
//    public static final Item MCD_UNNAMED_BLADE = registerItem("mcd_unnamed_blade", new SwordItem(GuiditeMaterial.INSTANCE, 9, -2.0F, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        // Register the item
        Item registeredItem = Registry.register(Registry.ITEM, new Identifier(SkyeCraft.MOD_ID, name), item);

        // Log the registration
        SkyeCraft.LOGGER.info("Registering Mod Sword: " + name);

        return registeredItem;
    }

}
