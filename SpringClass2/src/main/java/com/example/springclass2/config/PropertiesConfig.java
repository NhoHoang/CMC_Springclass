package com.example.springclass2.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "project")
@Getter
@Setter
public class PropertiesConfig {
    private String variable;
}
