package com.qej.betterbricks;

import com.qej.betterbricks.block.ModBlocks;
import com.qej.betterbricks.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Betterbricks implements ModInitializer {
    public static final String MODID = "betterbricks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize()
    {
        BetterBricksTab.registerItemGroups();

        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
    }
}
