package net.CraftedMichi.goldenpotato;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoldenPotato implements ModInitializer {
	public static final String MOD_ID = "golden-potato";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("I think its enabled");
	}
}