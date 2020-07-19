package com.maximum.abouttea.datagen.recipe;

import com.maximum.abouttea.AboutTea;
import com.maximum.abouttea.init.ModItems;
import com.maximum.abouttea.init.ModTea;
import net.minecraft.data.*;
import net.minecraft.item.Items;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }
    @Nonnull
    @Override
    public String getName() {
        return super.getName() + ": " + AboutTea.MODID;
    }
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer){
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.itemTeaBook.get(),1).addIngredient(ModTea.getTea("green_tea")).addIngredient(Items.BOOK).build(consumer);
    }
}