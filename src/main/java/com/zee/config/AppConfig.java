package com.zee.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class AppConfig {

    @Value("${author}")
    private String author;

    @Value("${age}")
    private int age;

}
