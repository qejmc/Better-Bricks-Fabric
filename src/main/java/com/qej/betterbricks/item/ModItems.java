package com.qej.betterbricks.item;

import com.qej.betterbricks.Betterbricks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item MORTAR = registerItem("mortar", new Item(new Item.Settings()));
    public static final Item TAN_DYE = registerItem("tan_dye", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Betterbricks.MODID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MORTAR);
            entries.add(TAN_DYE);
        });
    }
}
