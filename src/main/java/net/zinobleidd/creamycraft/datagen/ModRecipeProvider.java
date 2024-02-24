package net.zinobleidd.creamycraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.zinobleidd.creamycraft.item.ModItems;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BREAD_WITH_CREAM, 1)
                .pattern("B")
                .pattern("C")
                .pattern("B")
                .input('B', ModItems.BREAD_SLICE)
                .input('C', ModItems.PUMPKIN_CREAM)
                .criterion(hasItem(ModItems.BREAD_SLICE), conditionsFromItem(ModItems.BREAD_SLICE))
                .criterion(hasItem(ModItems.PUMPKIN_CREAM), conditionsFromItem(ModItems.PUMPKIN_CREAM))
                .offerTo(exporter);
    }
}
