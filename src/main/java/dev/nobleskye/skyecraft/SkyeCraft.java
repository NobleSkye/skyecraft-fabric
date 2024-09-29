package dev.nobleskye.skyecraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyeCraft implements ModInitializer {
	public static final String MOD_ID = "SkyeCraft"; // Make sure this matches the ID in fabric.mod.json
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Initialization logic here
		LOGGER.info("Skyecraft has been initialized!");
	}
}
