package com.zee.service;

import com.github.javafaker.Faker;
import com.zee.config.AppConfig;
import com.zee.enums.QuantityType;
import com.zee.enums.RecipeType;
import com.zee.model.Ingredient;
import com.zee.model.Recipe;
import com.zee.proxy.ShareService;
import com.zee.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@Component
public class RecipeServiceImpl implements RecipeService {


    private final Faker faker;
    private final ShareService shareService;
    private final RecipeRepository recipeRepository;
    private final AppConfig appConfig;




    @Override
    public boolean prepareRecipe() {

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(faker.food().dish(), 5, QuantityType.OUNCE));
        ingredients.add(new Ingredient(faker.food().dish(), 10, QuantityType.LB));
        ingredients.add(new Ingredient(faker.food().dish(), 7, QuantityType.TBSP));

        Recipe recipe = new Recipe(UUID.randomUUID(), faker.food().dish(), 60, faker.lorem().paragraph(5), ingredients, RecipeType.LUNCH);

        shareService.shareService(recipe);

        recipeRepository.save(recipe);

        return true;

    }

    public void printAppConfig(){
        System.out.println(appConfig.getAuthor() + " " + appConfig.getAge());
    }




}
