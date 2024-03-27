package com.zee.repository;

import com.zee.model.Recipe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SaveRecipeRepository implements RecipeRepository {


    @Override
    public void saveRecipe(Recipe recipe) {
        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(recipe);
    }
}
