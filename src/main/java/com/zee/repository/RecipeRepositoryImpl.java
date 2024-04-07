package com.zee.repository;

import com.zee.model.Recipe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecipeRepositoryImpl implements RecipeRepository {

    List<Recipe> recipeList = new ArrayList<>();

    @Override
    public boolean save(Recipe recipe) {
      return recipeList.add(recipe);
    }
}
