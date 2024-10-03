package dev.nobleskye.skyecraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import dev.nobleskye.skyecraft.SkyeCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup; // Import ItemGroup
import net.minecraft.item.SwordItem; // Import SwordItem
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final ItemGroup MCD_ITEMS = FabricItemGroupBuilder.create(
                    new Identifier(SkyeCraft.MOD_ID, "mcd_items"))
            .icon(() -> new ItemStack(PINK_GARNET)) // Use a relevant icon
            .build();

    public static final Item MCD_TRUTHSEEKER = registerSwordItem("mcd_truthseeker",
            new SwordItem(GuiditeMaterial.INSTANCE, 7, -2.4F, new Item.Settings().group(MCD_ITEMS)));

    public static final Item MCD_HEARTSTEALER = registerSwordItem("mcd_heartstealer",
            new SwordItem(GuiditeMaterial.INSTANCE, 6, -2.5F, new Item.Settings().group(MCD_ITEMS)));

    public static final Item MCD_RAPIER = registerSwordItem("mcd_rapier",
            new SwordItem(GuiditeMaterial.INSTANCE, 5, -2.0F, new Item.Settings().group(MCD_ITEMS)));

    public static final Item MCD_SWORD = registerSwordItem("mcd_sword",
            new SwordItem(GuiditeMaterial.INSTANCE, 7, -2.4F, new Item.Settings().group(MCD_ITEMS)));

    public static final Item MCD_UNNAMED_BLADE = registerSwordItem("mcd_unnamed_blade",
            new SwordItem(GuiditeMaterial.INSTANCE, 8, -2.2F, new Item.Settings().group(MCD_ITEMS)));

    private static Item registerSwordItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyeCraft.MOD_ID, name), item);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SkyeCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SkyeCraft.LOGGER.info("Registering Mod Items for " + SkyeCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(MCD_ITEMS).register(entries -> {

            // Add all your sword and tool items here
            entries.add(MCD_HEARTSTEALER);
            entries.add(MCD_RAPIER);
            entries.add(MCD_TRUTHSEEKER);
            entries.add(MCD_SWORD);
            entries.add(MCD_UNNAMED_BLADE);
        });
    }
}
