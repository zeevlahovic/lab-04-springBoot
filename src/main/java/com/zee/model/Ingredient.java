package com.zee.model;

import com.zee.enums.QuantityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor

public class Ingredient {

    private String name;
    private int quantity;
    private QuantityType quantityType;
}
