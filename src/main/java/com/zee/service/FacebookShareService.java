package com.zee.service;

import com.zee.model.Recipe;
import org.springframework.context.annotation.Primary;

public class FacebookShareService implements ShareService{


    @Primary
    @Override
    public void shareService(Recipe recipe) {

    }
}
