package dev.nobleskye.skyecraft;

import dev.nobleskye.skyecraft.block.ModBlocks;
import dev.nobleskye.skyecraft.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyeCraft implements ModInitializer {
	public static final String MOD_ID = "skyecraft"; // Make sure this matches the ID in fabric.mod.json
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.regsiterModBlocks();


		LOGGER.info("Skyecraft has been initialized!");
	}
}
