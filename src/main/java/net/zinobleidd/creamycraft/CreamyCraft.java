package net.zinobleidd.creamycraft;

import net.fabricmc.api.ModInitializer;
import net.zinobleidd.creamycraft.block.ModBlocks;
import net.zinobleidd.creamycraft.item.ModItemGroups;
import net.zinobleidd.creamycraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreamyCraft implements ModInitializer {
    public static final String MOD_ID = "creamycraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}