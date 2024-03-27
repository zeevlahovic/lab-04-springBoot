package com.zee.model;

import com.zee.enums.RecipeType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Recipe {

    private UUID id;
    private String name;
    private int duration;
    private List<Ingredient>ingredients;
    private RecipeType recipeType;


}
