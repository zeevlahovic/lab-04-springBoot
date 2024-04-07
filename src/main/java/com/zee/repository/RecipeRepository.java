package com.zee.repository;

import com.zee.model.Recipe;

public interface RecipeRepository {

    boolean save(Recipe recipe);
}
