package net.zinobleidd.creamycraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zinobleidd.creamycraft.CreamyCraft;
import net.zinobleidd.creamycraft.item.custom.ModGlassJarItem;

public class ModItems {
    public static final Item APPLE_ICE_CREAM = registerItem(
            "apple_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_ICE_CREAM))
    );

    public static final Item BREAD_SLICE = registerItem(
            "bread_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.BREAD_SLICE))
    );

    public static final Item BREAD_WITH_CREAM = registerItem(
            "bread_with_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.BREAD_WITH_CREAM))
    );

    public static final Item CARAMEL_JAR = registerItem(
            "caramel_jar",
            new ModGlassJarItem(new FabricItemSettings().food(ModFoodComponents.CARAMEL_JAR))
    );

    public static final Item COOKIE_ICE_CREAM_SANDWICH = registerItem(
            "cookie_ice_cream_sandwich",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKIE_ICE_CREAM_SANDWICH))
    );

    public static final Item GOLDEN_APPLE_ICE_CREAM = registerItem(
            "golden_apple_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_APPLE_ICE_CREAM))
    );

    public static final Item CHOCO_ICE_CREAM = registerItem(
            "choco_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCO_ICE_CREAM))
    );

    public static final Item CREEPER_ESSENCE = registerItem(
            "creeper_essence",
            new Item(new FabricItemSettings().food(ModFoodComponents.CREEPER_ESSENCE))
    );

    public static final Item CREEPER_ICE_CREAM = registerItem(
            "creeper_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.CREEPER_ICE_CREAM))
    );

    public static final Item CHOCO_SUNDAE = registerItem(
            "choco_sundae",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCO_SUNDAE))
    );

    public static final Item PUMPKIN_CREAM = registerItem(
            "pumpkin_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.PUMPKIN_CREAM))
    );

    public static final Item JAFFA_CAKE = registerItem(
            "jaffa_cake",
            new Item(new FabricItemSettings().food(ModFoodComponents.JAFFA_CAKE))
    );

    public static final Item SUNDAY_SPECIAL = registerItem(
            "sunday_special",
            new Item(new FabricItemSettings().food(ModFoodComponents.SUNDAY_SPECIAL))
    );

    public static final Item HOT_ICE_CREAM = registerItem(
            "hot_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.HOT_ICE_CREAM))
    );

    public static final Item GLASS_JAR = registerItem(
            "glass_jar",
            new ModGlassJarItem(new FabricItemSettings())
    );

    private static void addItemsToFoodGroup(FabricItemGroupEntries entries) {
        entries.add(APPLE_ICE_CREAM);
        entries.add(BREAD_SLICE);
        entries.add(BREAD_WITH_CREAM);
        entries.add(CARAMEL_JAR);
        entries.add(COOKIE_ICE_CREAM_SANDWICH);
        entries.add(GOLDEN_APPLE_ICE_CREAM);
        entries.add(CHOCO_ICE_CREAM);
        entries.add(CREEPER_ESSENCE);
        entries.add(CREEPER_ICE_CREAM);
        entries.add(CHOCO_SUNDAE);
        entries.add(PUMPKIN_CREAM);
        entries.add(JAFFA_CAKE);
        entries.add(SUNDAY_SPECIAL);
        entries.add(HOT_ICE_CREAM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreamyCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CreamyCraft.LOGGER.info("Registering mod items for " + CreamyCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodGroup);
    }
}
