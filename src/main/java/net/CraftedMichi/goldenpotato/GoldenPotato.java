package net.CraftedMichi.goldenpotato;

import net.CraftedMichi.goldenpotato.item.ModItemGroups;
import net.CraftedMichi.goldenpotato.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoldenPotato implements ModInitializer {
	public static final String MOD_ID = "golden-potato";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		LOGGER.info("[Golden Potatoes] I think its enabled");
	}
}