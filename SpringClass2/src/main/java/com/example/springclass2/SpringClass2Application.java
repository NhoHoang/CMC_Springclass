package com.example.springclass2;

import com.example.springclass2.config.PropertiesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(PropertiesConfig.class)
public class SpringClass2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringClass2Application.class, args);

    }

}
