package com.zee.model;

import com.zee.enums.QuantityType;
import lombok.Data;


@Data


public class Ingredient {

    private String name;
    private int quantity;
    private QuantityType quantityType;
}
