package dev.nobleskye.skyecraft.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import dev.nobleskye.skyecraft.SkyeCraft;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;


public class ModBlocks {
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool()));

    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));



    public static final Block HYTALE_COBBLESTONE = registerBlock("hytale_cobblestone",
            new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

//    public static final Block HYTALE_ACACIA_DOOR = registerBlock("hytale_acacia_door",
//            new DoorBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_DOOR)));

    public static final Block HYTALE_ACACIA_LOG = registerBlock("hytale_acacia_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)));

    public static final Block HYTALE_ACACIA_PLANKS = registerBlock("hytale_acacia_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));

//    public static final Block HYTALE_ACACIA_TRAPDOOR = registerBlock("hytale_acacia_trapdoor",
//            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_TRAPDOOR)));

    public static final Block HYTALE_ANDESITE = registerBlock("hytale_andesite",
            new Block(AbstractBlock.Settings.copy(Blocks.ANDESITE)));

//    public static final Block HYTALE_BIGDOOR = registerBlock("hytale_bigdoor",
//            new DoorBlock(AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));

//    public static final Block HYTALE_BIRCH_DOOR = registerBlock("hytale_birch_door",
//            new DoorBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_DOOR)));

//    public static final Block HYTALE_BIRCH_LOG = registerBlock("hytale_birch_log",
//            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG)));

    public static final Block HYTALE_BIRCH_PLANKS = registerBlock("hytale_birch_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));

//    public static final Block HYTALE_BIRCH_TRAPDOOR = registerBlock("hytale_birch_trapdoor",
//            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_TRAPDOOR)));

    public static final Block HYTALE_BLUE_ICE = registerBlock("hytale_blue_ice",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));

    public static final Block HYTALE_BOOKSHELF = registerBlock("hytale_bookshelf",
            new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF)));

    public static final Block HYTALE_BRICKS = registerBlock("hytale_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));

    public static final Block HYTALE_CACTUS = registerBlock("hytale_cactus",
            new CactusBlock(AbstractBlock.Settings.copy(Blocks.CACTUS)));

//    public static final Block HYTALE_CAMPFIRE = registerBlock("hytale_campfire",
//            new CampfireBlock(AbstractBlock.Settings.copy(Blocks.CAMPFIRE)));

    public static final Block HYTALE_CHISELED_RED_SANDSTONE = registerBlock("hytale_chiseled_red_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE)));

    public static final Block HYTALE_CHISELED_SANDSTONE = registerBlock("hytale_chiseled_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE)));

    public static final Block HYTALE_CHISELED_STONE_BRICKS = registerBlock("hytale_chiseled_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block HYTALE_COAL_SMALL = registerBlock("hytale_coal_small",
            new Block(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));

    public static final Block HYTALE_CRACKED_STONE_BRICKS = registerBlock("hytale_cracked_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block HYTALE_CUT_RED_SANDSTONE = registerBlock("hytale_cut_red_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));

    public static final Block HYTALE_CUT_SANDSTONE = registerBlock("hytale_cut_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));

//    public static final Block HYTALE_DARK_OAK_DOOR = registerBlock("hytale_dark_oak_door",
//            new DoorBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_DOOR)));

    public static final Block HYTALE_DARK_OAK_LOG = registerBlock("hytale_dark_oak_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG)));

    public static final Block HYTALE_DARK_OAK_PLANKS = registerBlock("hytale_dark_oak_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));

//    public static final Block HYTALE_DARK_OAK_TRAPDOOR = registerBlock("hytale_dark_oak_trapdoor",
//            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_TRAPDOOR)));

//    public static final Block HYTALE_DARK_OAK_WINDOW = registerBlock("hytale_dark_oak_window",
//            new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS)));

    public static final Block HYTALE_DIAMOND_SMALL = registerBlock("hytale_diamond_small",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));

    public static final Block HYTALE_DIORITE = registerBlock("hytale_diorite",
            new Block(AbstractBlock.Settings.copy(Blocks.DIORITE)));

    public static final Block HYTALE_DIRT = registerBlock("hytale_dirt",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT)));

    public static final Block HYTALE_EMERALD_SMALL = registerBlock("hytale_emerald_small",
            new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

//    public static final Block HYTALE_FANCY_WINDOW = registerBlock("hytale_fancy_window",
//            new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS)));

//    public static final Block HYTALE_FANCY_WINDOW_LIT = registerBlock("hytale_fancy_window_lit",
//            new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS).luminance((state) -> 15)));

    public static final Block HYTALE_FARMLAND = registerBlock("hytale_farmland",
            new FarmlandBlock(AbstractBlock.Settings.copy(Blocks.FARMLAND)));

//    public static final Block HYTALE_FERN = registerBlock("hytale_fern",
//            new FernBlock(AbstractBlock.Settings.copy(Blocks.FERN)));

    public static final Block HYTALE_GOLD_SMALL = registerBlock("hytale_gold_small",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));

    public static final Block HYTALE_GRANITE = registerBlock("hytale_granite",
            new Block(AbstractBlock.Settings.copy(Blocks.GRANITE)));

    public static final Block HYTALE_GRASS = registerBlock("hytale_grass",
            new GrassBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK)));

    public static final Block HYTALE_IRON_BARS = registerBlock("hytale_iron_bars",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.IRON_BARS)));

    public static final Block HYTALE_IRON_SMALL = registerBlock("hytale_iron_small",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

//    public static final Block HYTALE_JUNGLE_DOOR = registerBlock("hytale_jungle_door",
//            new DoorBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_DOOR)));

    public static final Block HYTALE_JUNGLE_LOG = registerBlock("hytale_jungle_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG)));

    public static final Block HYTALE_JUNGLE_PLANKS = registerBlock("hytale_jungle_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));

//    public static final Block HYTALE_JUNGLE_TRAPDOOR = registerBlock("hytale_jungle_trapdoor",
//            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_TRAPDOOR)));

    public static final Block HYTALE_LAPIS_SMALL = registerBlock("hytale_lapis_small",
            new Block(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));

    public static final Block HYTALE_LAVA = registerBlock("hytale_lava",
            new FluidBlock(Fluids.LAVA, AbstractBlock.Settings.copy(Blocks.LAVA)));

    public static final Block HYTALE_MOSSY_COBBLESTONE = registerBlock("hytale_mossy_cobblestone",
            new Block(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final Block HYTALE_MOSSY_STONE_BRICKS = registerBlock("hytale_mossy_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS)));

//    public static final Block HYTALE_OAK_DOOR = registerBlock("hytale_oak_door",
//            new DoorBlock(AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));

    public static final Block HYTALE_OAK_LOG = registerBlock("hytale_oak_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

    public static final Block HYTALE_OAK_PLANKS = registerBlock("hytale_oak_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

//    public static final Block HYTALE_OAK_TRAPDOOR = registerBlock("hytale_oak_trapdoor",
//            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

//    public static final Block HYTALE_OAK_WINDOW = registerBlock("hytale_oak_window",
//            new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS)));

    public static final Block HYTALE_PACKED_ICE = registerBlock("hytale_packed_ice",
            new Block(AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));

    public static final Block HYTALE_PINK_CAVE_CRYSTAL = registerBlock("hytale_pink_cave_crystal",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));

    public static final Block HYTALE_PODZOL = registerBlock("hytale_podzol",
            new Block(AbstractBlock.Settings.copy(Blocks.PODZOL)));

    public static final Block HYTALE_POLISHED_ANDESITE = registerBlock("hytale_polished_andesite",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));

    public static final Block HYTALE_POLISHED_GRANITE = registerBlock("hytale_polished_granite",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));

    public static final Block HYTALE_PORTAL = registerBlock("hytale_portal",
            new NetherPortalBlock(AbstractBlock.Settings.copy(Blocks.NETHER_PORTAL)));

//    public static final Block HYTALE_RED_SAND = registerBlock("hytale_red_sand",
//            new SandBlock(14406560, AbstractBlock.Settings.copy(Blocks.RED_SAND)));

    public static final Block HYTALE_RED_SANDSTONE = registerBlock("hytale_red_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));

    public static final Block HYTALE_REDSTONE_SMALL = registerBlock("hytale_redstone_small",
            new Block(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));

//    public static final Block HYTALE_SAND = registerBlock("hytale_sand",
//            new SandBlock(14406560, AbstractBlock.Settings.copy(Blocks.SAND)));

    public static final Block HYTALE_SAND_GRASS = registerBlock("hytale_sand_grass",
            new GrassBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK)));

    public static final Block HYTALE_SANDSTONE = registerBlock("hytale_sandstone",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));

    public static final Block HYTALE_SANDSTONE_BRICK = registerBlock("hytale_sandstone_brick",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));

    public static final Block HYTALE_SANDSTONE_BRICKS = registerBlock("hytale_sandstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));

    public static final Block HYTALE_SANDSTONE_CHISELED = registerBlock("hytale_sandstone_chiseled",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE)));

    public static final Block HYTALE_SANDSTONE_COBBLE = registerBlock("hytale_sandstone_cobble",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));

    public static final Block HYTALE_SANDSTONE_SMOOTH = registerBlock("hytale_sandstone_smooth",
            new Block(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));

    public static final Block HYTALE_SMOOTH_STONE = registerBlock("hytale_smooth_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));

    public static final Block HYTALE_SNOW = registerBlock("hytale_snow",
            new SnowBlock(AbstractBlock.Settings.copy(Blocks.SNOW)));

//    public static final Block HYTALE_SPRUCE_DOOR = registerBlock("hytale_spruce_door",
//            new DoorBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_DOOR)));

    public static final Block HYTALE_SPRUCE_LOG = registerBlock("hytale_spruce_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG)));

    public static final Block HYTALE_SPRUCE_PLANKS = registerBlock("hytale_spruce_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));

//    public static final Block HYTALE_SPRUCE_TRAPDOOR = registerBlock("hytale_spruce_trapdoor",
//            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_TRAPDOOR)));

    public static final Block HYTALE_STONE_CHISELED_BLOCK = registerBlock("hytale_stone_chiseled_block",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block HYTALE_STONE = registerBlock("hytale_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block HYTALE_STONE_BRICKS = registerBlock("hytale_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));

    public static final Block HYTALE_STRIPPED_ACACIA_LOG = registerBlock("hytale_stripped_acacia_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_LOG)));

    public static final Block HYTALE_STRIPPED_BIRCH_LOG = registerBlock("hytale_stripped_birch_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG)));

    public static final Block HYTALE_STRIPPED_DARK_OAK_LOG = registerBlock("hytale_stripped_dark_oak_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_LOG)));

    public static final Block HYTALE_SWAMPDIRT = registerBlock("hytale_swampdirt",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT)));

    public static final Block HYTALE_TALL_GRASS = registerBlock("hytale_tall_grass",
            new TallPlantBlock(AbstractBlock.Settings.copy(Blocks.TALL_GRASS)));

    public static final Block HYTALE_VINE = registerBlock("hytale_vine",
            new VineBlock(AbstractBlock.Settings.copy(Blocks.VINE)));

    public static final Block HYTALE_WATER = registerBlock("hytale_water",
            new FluidBlock(Fluids.WATER, AbstractBlock.Settings.copy(Blocks.WATER)));

    public static final Block HYTALE_WOOD_SMALL = registerBlock("hytale_wood_small",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SkyeCraft.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SkyeCraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SkyeCraft.LOGGER.info("Registering Mod Blocks for " + SkyeCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PINK_GARNET_BLOCK);
            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
            entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
            entries.add(ModBlocks.PINK_GARNET_ORE);



            entries.add(ModBlocks.HYTALE_COBBLESTONE);
//            entries.add(ModBlocks.HYTALE_ACACIA_DOOR);
            entries.add(ModBlocks.HYTALE_ACACIA_LOG);
            entries.add(ModBlocks.HYTALE_ACACIA_PLANKS);
//            entries.add(ModBlocks.HYTALE_ACACIA_TRAPDOOR);
            entries.add(ModBlocks.HYTALE_ANDESITE);
//            entries.add(ModBlocks.HYTALE_BIGDOOR);
//            entries.add(ModBlocks.HYTALE_BIRCH_DOOR);
//            entries.add(ModBlocks.HYTALE_BIRCH_LOG);
            entries.add(ModBlocks.HYTALE_BIRCH_PLANKS);
//            entries.add(ModBlocks.HYTALE_BIRCH_TRAPDOOR);
            entries.add(ModBlocks.HYTALE_BLUE_ICE);
            entries.add(ModBlocks.HYTALE_BOOKSHELF);
            entries.add(ModBlocks.HYTALE_BRICKS);
            entries.add(ModBlocks.HYTALE_CACTUS);
//            entries.add(ModBlocks.HYTALE_CAMPFIRE);
            entries.add(ModBlocks.HYTALE_CHISELED_RED_SANDSTONE);
            entries.add(ModBlocks.HYTALE_CHISELED_SANDSTONE);
            entries.add(ModBlocks.HYTALE_CHISELED_STONE_BRICKS);
            entries.add(ModBlocks.HYTALE_COAL_SMALL);
            entries.add(ModBlocks.HYTALE_CRACKED_STONE_BRICKS);
            entries.add(ModBlocks.HYTALE_CUT_RED_SANDSTONE);
            entries.add(ModBlocks.HYTALE_CUT_SANDSTONE);
//            entries.add(ModBlocks.HYTALE_DARK_OAK_DOOR);
            entries.add(ModBlocks.HYTALE_DARK_OAK_LOG);
            entries.add(ModBlocks.HYTALE_DARK_OAK_PLANKS);
//            entries.add(ModBlocks.HYTALE_DARK_OAK_TRAPDOOR);
//            entries.add(ModBlocks.HYTALE_DARK_OAK_WINDOW);
            entries.add(ModBlocks.HYTALE_DIAMOND_SMALL);
            entries.add(ModBlocks.HYTALE_DIORITE);
            entries.add(ModBlocks.HYTALE_DIRT);
            entries.add(ModBlocks.HYTALE_EMERALD_SMALL);
//            entries.add(ModBlocks.HYTALE_FANCY_WINDOW);
//            entries.add(ModBlocks.HYTALE_FANCY_WINDOW_LIT);
            entries.add(ModBlocks.HYTALE_FARMLAND);
//            entries.add(ModBlocks.HYTALE_FERN);
            entries.add(ModBlocks.HYTALE_GOLD_SMALL);
            entries.add(ModBlocks.HYTALE_GRANITE);
            entries.add(ModBlocks.HYTALE_GRASS);
            entries.add(ModBlocks.HYTALE_IRON_BARS);
            entries.add(ModBlocks.HYTALE_IRON_SMALL);
//            entries.add(ModBlocks.HYTALE_JUNGLE_DOOR);
            entries.add(ModBlocks.HYTALE_JUNGLE_LOG);
            entries.add(ModBlocks.HYTALE_JUNGLE_PLANKS);
//            entries.add(ModBlocks.HYTALE_JUNGLE_TRAPDOOR);
            entries.add(ModBlocks.HYTALE_LAPIS_SMALL);
            entries.add(ModBlocks.HYTALE_LAVA);
            entries.add(ModBlocks.HYTALE_MOSSY_COBBLESTONE);
            entries.add(ModBlocks.HYTALE_MOSSY_STONE_BRICKS);
//            entries.add(ModBlocks.HYTALE_OAK_DOOR);
            entries.add(ModBlocks.HYTALE_OAK_LOG);
            entries.add(ModBlocks.HYTALE_OAK_PLANKS);
//            entries.add(ModBlocks.HYTALE_OAK_TRAPDOOR);
//            entries.add(ModBlocks.HYTALE_OAK_WINDOW);
            entries.add(ModBlocks.HYTALE_PACKED_ICE);
            entries.add(ModBlocks.HYTALE_PINK_CAVE_CRYSTAL);
            entries.add(ModBlocks.HYTALE_PODZOL);
            entries.add(ModBlocks.HYTALE_POLISHED_ANDESITE);
            entries.add(ModBlocks.HYTALE_POLISHED_GRANITE);
            entries.add(ModBlocks.HYTALE_PORTAL);
//            entries.add(ModBlocks.HYTALE_RED_SAND);
            entries.add(ModBlocks.HYTALE_RED_SANDSTONE);
            entries.add(ModBlocks.HYTALE_REDSTONE_SMALL);
//            entries.add(ModBlocks.HYTALE_SAND);
            entries.add(ModBlocks.HYTALE_SAND_GRASS);
            entries.add(ModBlocks.HYTALE_SANDSTONE);
            entries.add(ModBlocks.HYTALE_SANDSTONE_BRICK);
            entries.add(ModBlocks.HYTALE_SANDSTONE_BRICKS);
            entries.add(ModBlocks.HYTALE_SANDSTONE_CHISELED);
            entries.add(ModBlocks.HYTALE_SANDSTONE_COBBLE);
            entries.add(ModBlocks.HYTALE_SANDSTONE_SMOOTH);
            entries.add(ModBlocks.HYTALE_SMOOTH_STONE);
            entries.add(ModBlocks.HYTALE_SNOW);
//            entries.add(ModBlocks.HYTALE_SPRUCE_DOOR);
            entries.add(ModBlocks.HYTALE_SPRUCE_LOG);
            entries.add(ModBlocks.HYTALE_SPRUCE_PLANKS);
//            entries.add(ModBlocks.HYTALE_SPRUCE_TRAPDOOR);
            entries.add(ModBlocks.HYTALE_STONE_CHISELED_BLOCK);
            entries.add(ModBlocks.HYTALE_STONE);
            entries.add(ModBlocks.HYTALE_STONE_BRICKS);
            entries.add(ModBlocks.HYTALE_STRIPPED_ACACIA_LOG);
            entries.add(ModBlocks.HYTALE_STRIPPED_BIRCH_LOG);
            entries.add(ModBlocks.HYTALE_STRIPPED_DARK_OAK_LOG);
            entries.add(ModBlocks.HYTALE_SWAMPDIRT);
            entries.add(ModBlocks.HYTALE_TALL_GRASS);
            entries.add(ModBlocks.HYTALE_VINE);
            entries.add(ModBlocks.HYTALE_WATER);
            entries.add(ModBlocks.HYTALE_WOOD_SMALL);



        });
    }
}
