package dev.nobleskye.skyecraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import dev.nobleskye.skyecraft.SkyeCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item MCD_TRUTHSEEKER = registerItem("mcd_truthseeker", new Item(new Item.Settings()));
    public static final Item MCD_RAPIER = registerItem("mcd_rapier", new Item(new Item.Settings()));
    public static final Item MCD_HEARTSTEALER = registerItem("mcd_heartstealer", new Item(new Item.Settings()));
    public static final Item MCD_SWORD = registerItem("mcd_sword", new Item(new Item.Settings()));
    public static final Item MCD_UNNAMED_BLADE = registerItem("mcd_unnamed_blade", new Item(new Item.Settings()));

    public static final Item LIGHTER = registerItem("lighter", new Item(new Item.Settings()));
    public static final Item LOCK_PICK = registerItem("lock_pick", new Item(new Item.Settings()));

    public static final Item HYTALE_MERGER = registerItem("hytale_merger", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SkyeCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SkyeCraft.LOGGER.info("Registering Mod Items for " + SkyeCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(LIGHTER);
            entries.add(LOCK_PICK);
            entries.add(MCD_TRUTHSEEKER);
            entries.add(MCD_RAPIER);
            entries.add(MCD_HEARTSTEALER);
            entries.add(MCD_SWORD);
            entries.add(MCD_UNNAMED_BLADE);
            entries.add(HYTALE_MERGER);
        });
    }
}