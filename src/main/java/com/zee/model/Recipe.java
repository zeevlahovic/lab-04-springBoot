package com.zee.model;

import com.zee.enums.RecipeType;
import lombok.Data;



import java.util.List;
import java.util.UUID;

@Data


public class Recipe {

    private UUID Id;
    private String name;
    private int duration;
    private String preparation;
    private List<Ingredient>ingredients;
    private RecipeType recipeType;


}
