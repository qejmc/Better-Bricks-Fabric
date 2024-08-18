package com.qej.betterbricks.block;

import com.qej.betterbricks.Betterbricks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    /*
     * STANDARD BRICK BLOCKS
     */
    public static final Block TAN_BRICKS = registerBlock("tan_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block GRAY_BRICKS = registerBlock("gray_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block BROWN_MULTICOLOR_BRICKS = registerBlock("brown_multicolor_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block TAN_MULTICOLOR_BRICKS = registerBlock("tan_multicolor_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHEAT_BRICKS = registerBlock("wheat_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHITE_BRICKS = registerBlock("white_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHITE_THIN_BRICKS = registerBlock("white_thin_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block LIGHT_GRAY_BRICKS_ALT = registerBlock("light_gray_bricks_alt",
            new Block(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));
    
    /*
     * STANDARD BRICK STAIRS
     */

    public static final Block TAN_BRICK_STAIRS = registerBlock("tan_brick_stairs",
            new StairsBlock(ModBlocks.TAN_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs",
            new StairsBlock(ModBlocks.GRAY_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs",
            new StairsBlock(ModBlocks.LIGHT_GRAY_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(ModBlocks.SANDSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block BROWN_MULTICOLOR_BRICK_STAIRS = registerBlock("brown_multicolor_brick_stairs",
            new StairsBlock(ModBlocks.BROWN_MULTICOLOR_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block TAN_MULTICOLOR_BRICK_STAIRS = registerBlock("tan_multicolor_brick_stairs",
            new StairsBlock(ModBlocks.TAN_MULTICOLOR_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHEAT_BRICK_STAIRS = registerBlock("wheat_brick_stairs",
            new StairsBlock(ModBlocks.WHEAT_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            new StairsBlock(ModBlocks.WHITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHITE_THIN_BRICK_STAIRS = registerBlock("white_thin_brick_stairs",
            new StairsBlock(ModBlocks.WHITE_THIN_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block LIGHT_GRAY_BRICKS_ALT_STAIRS = registerBlock("light_gray_bricks_alt_stairs",
            new StairsBlock(ModBlocks.LIGHT_GRAY_BRICKS_ALT.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));


    /*
     * STANDARD BRICK SLABS
     */

    public static final Block TAN_BRICK_SLAB = registerBlock("tan_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block GRAY_BRICK_SLAB = registerBlock("gray_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block BROWN_MULTICOLOR_BRICK_SLAB = registerBlock("brown_multicolor_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block TAN_MULTICOLOR_BRICK_SLAB = registerBlock("tan_multicolor_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHEAT_BRICK_SLAB = registerBlock("wheat_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block WHITE_THIN_BRICK_SLAB = registerBlock("white_thin_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    public static final Block LIGHT_GRAY_BRICKS_ALT_SLAB = registerBlock("light_gray_bricks_alt_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.0f).sounds(BlockSoundGroup.STONE).requiresTool()));

    /*
     * REGISTER BLOCKS AND ITEMS
     */

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Betterbricks.MODID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Betterbricks.MODID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Betterbricks.LOGGER.info("Registering Mod Blocks for " + Betterbricks.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TAN_BRICKS);
            entries.add(ModBlocks.TAN_BRICK_STAIRS);
            entries.add(ModBlocks.TAN_BRICK_SLAB);

            entries.add(ModBlocks.BROWN_MULTICOLOR_BRICKS);
            entries.add(ModBlocks.BROWN_MULTICOLOR_BRICK_STAIRS);
            entries.add(ModBlocks.BROWN_MULTICOLOR_BRICK_SLAB);

            entries.add(ModBlocks.GRAY_BRICKS);
            entries.add(ModBlocks.GRAY_BRICK_STAIRS);
            entries.add(ModBlocks.GRAY_BRICK_SLAB);

            entries.add(ModBlocks.LIGHT_GRAY_BRICKS);
            entries.add(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
            entries.add(ModBlocks.LIGHT_GRAY_BRICK_SLAB);

            entries.add(ModBlocks.SANDSTONE_BRICKS);
            entries.add(ModBlocks.SANDSTONE_BRICK_STAIRS);
            entries.add(ModBlocks.SANDSTONE_BRICK_SLAB);

            entries.add(ModBlocks.TAN_MULTICOLOR_BRICKS);
            entries.add(ModBlocks.TAN_MULTICOLOR_BRICK_STAIRS);
            entries.add(ModBlocks.TAN_MULTICOLOR_BRICK_SLAB);

            entries.add(ModBlocks.WHEAT_BRICKS);
            entries.add(ModBlocks.WHEAT_BRICK_STAIRS);
            entries.add(ModBlocks.WHEAT_BRICK_SLAB);

            entries.add(ModBlocks.WHITE_BRICKS);
            entries.add(ModBlocks.WHITE_BRICK_STAIRS);
            entries.add(ModBlocks.WHITE_BRICK_SLAB);

            entries.add(ModBlocks.WHITE_THIN_BRICKS);
            entries.add(ModBlocks.WHITE_THIN_BRICK_STAIRS);
            entries.add(ModBlocks.WHITE_THIN_BRICK_SLAB);

            entries.add(ModBlocks.LIGHT_GRAY_BRICKS_ALT);
            entries.add(ModBlocks.LIGHT_GRAY_BRICKS_ALT_STAIRS);
            entries.add(ModBlocks.LIGHT_GRAY_BRICKS_ALT_SLAB);
        });
    }
}
