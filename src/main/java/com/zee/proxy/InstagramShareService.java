package com.zee.proxy;

import com.zee.model.Recipe;
import org.springframework.stereotype.Component;

@Component
public class InstagramShareService implements ShareService{

    @Override
    public void shareService(Recipe recipe) {
        System.out.println("recipe shared on facebook");
    }
}
