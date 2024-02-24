package net.zinobleidd.creamycraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zinobleidd.creamycraft.CreamyCraft;

public class ModItemGroups {
    public static final ItemGroup CREAMYCRAFT_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(CreamyCraft.MOD_ID, "creamycraft_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("item_group.creamycraft"))
                    .icon(() -> new ItemStack(ModItems.COOKIE_ICE_CREAM_SANDWICH))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.APPLE_ICE_CREAM);
                        entries.add(ModItems.BREAD_SLICE);
                        entries.add(ModItems.BREAD_WITH_CREAM);
                        entries.add(ModItems.CARAMEL_JAR);
                        entries.add(ModItems.CHOCO_ICE_CREAM);
                        entries.add(ModItems.CHOCO_SUNDAE);
                        entries.add(ModItems.COOKIE_ICE_CREAM_SANDWICH);
                        entries.add(ModItems.CREEPER_ESSENCE);
                        entries.add(ModItems.CREEPER_ICE_CREAM);
                        entries.add(ModItems.GLASS_JAR);
                        entries.add(ModItems.GOLDEN_APPLE_ICE_CREAM);
                        entries.add(ModItems.HOT_ICE_CREAM);
                        entries.add(ModItems.JAFFA_CAKE);
                        entries.add(ModItems.PUMPKIN_CREAM);
                        entries.add(ModItems.SUNDAY_SPECIAL);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        CreamyCraft.LOGGER.info("Registering item groups for " + CreamyCraft.MOD_ID);
    }
}
