package net.CraftedMichi.goldenpotato.item;

import net.CraftedMichi.goldenpotato.GoldenPotato;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item GOLDEN_POTATO = registerItem("golden_potato", new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_POTATO)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GoldenPotato.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GoldenPotato.LOGGER.info("Registering Potato for" + GoldenPotato.MOD_ID);
    }
}
