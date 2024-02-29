package net.zinobleidd.creamycraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.zinobleidd.creamycraft.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.APPLE_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BREAD_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BREAD_WITH_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARAMEL_JAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCO_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCO_SUNDAE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKIE_ICE_CREAM_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREEPER_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREEPER_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_APPLE_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOT_ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAFFA_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUNDAY_SPECIAL, Models.GENERATED);
    }
}
