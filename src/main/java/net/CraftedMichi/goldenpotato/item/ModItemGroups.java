package net.CraftedMichi.goldenpotato.item;

import net.CraftedMichi.goldenpotato.GoldenPotato;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GOLDEN_POTATO_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GoldenPotato.MOD_ID, "golden_potato_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GOLDEN_POTATO))
                    .displayName(Text.translatable("itemgroup.golden-potato.golden_potato_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLDEN_POTATO);
                    }).build());

    public static void registerItemGroups() {
        GoldenPotato.LOGGER.info("Registering Item Groups for " + GoldenPotato.MOD_ID);
    }
}
