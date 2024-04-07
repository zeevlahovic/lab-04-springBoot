package com.zee.service;

import com.github.javafaker.Faker;
import com.zee.enums.QuantityType;
import com.zee.enums.RecipeType;
import com.zee.model.Ingredient;
import com.zee.model.Recipe;
import com.zee.proxy.ShareService;
import com.zee.repository.RecipeRepository;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Data
@Component
public class RecipeServiceImpl implements RecipeService {


    private final Faker faker;
    private final RecipeRepository recipeRepository;
    private final ShareService shareService;

    public RecipeServiceImpl(Faker faker, RecipeRepository recipeRepository, ShareService shareService) {
        this.faker = faker;
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
    }

    @Override
    public boolean prepareRecipe() {

        Recipe recipe = new Recipe();

        recipe.setId(UUID.randomUUID());
        recipe.setName(faker.food().dish());
        recipe.setDuration(generateRandomValue());
        recipe.setPreparation(faker.lorem().paragraph(5));
        recipe.setRecipeType(RecipeType.BREAKFAST);
        recipe.setIngredients(prepareIngredients());

        recipeRepository.save(recipe);

        shareService.shareService(recipe);

        return true;
    }

    private List<Ingredient> prepareIngredients() {
        //create a list
        List<Ingredient> ingredientList = new ArrayList<>();
        //fill list with random ingredients
        for (int i = 0; i < generateRandomValue(); i++) {
            Ingredient ingredient = new Ingredient();

            ingredient.setName(faker.food().ingredient());
            ingredient.setQuantity(generateRandomValue());
            ingredient.setQuantityType(QuantityType.TBSP);

            ingredientList.add(ingredient);
        }
        //return list
        return ingredientList;
    }

    private int generateRandomValue() {
        return new Random().nextInt(20) + 1;
    }
}
