package dev.nobleskye.skyecraft.item;

import dev.nobleskye.skyecraft.SkyeCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = regitsterItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = regitsterItem("raw_pink_garnet", new Item(new Item.Settings()));


    private static Item regitsterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SkyeCraft.MOD_ID, name), item);
    }


    public static void registerModItems() {
        SkyeCraft.LOGGER.info("Registering Mod Items for " + SkyeCraft.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
