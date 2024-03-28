package com.zee.proxy;

import com.zee.model.Recipe;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FacebookShareService implements ShareService{



    @Override
    public void shareService(Recipe recipe) {
        System.out.println("recipe shared on facebook");
    }
}
