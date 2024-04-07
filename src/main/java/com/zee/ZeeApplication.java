package com.zee;

import com.github.javafaker.Faker;
import com.zee.service.RecipeService;
import com.zee.service.RecipeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZeeApplication {

    public static void main(String[] args) {

        ApplicationContext container = SpringApplication.run(ZeeApplication.class, args);

        RecipeService recipeService = container.getBean(RecipeService.class);

        recipeService.prepareRecipe();

    }

    @Bean
    public Faker faker(){
        return new Faker();
    }
}



