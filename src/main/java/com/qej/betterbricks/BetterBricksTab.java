package com.qej.betterbricks;

import com.qej.betterbricks.block.ModBlocks;
import com.qej.betterbricks.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BetterBricksTab
{
    public static final ItemGroup BETTER_BRICKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Betterbricks.MODID, "betterbricks_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TAN_BRICKS))
                    .displayName(Text.translatable("itemGroup.betterbricks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MORTAR);
                        entries.add(ModItems.TAN_DYE);

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
                    }).build());

    public static void registerItemGroups() {
    }
}
