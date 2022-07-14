package com.example.springclass2.config;

import com.example.springclass2.service.UserService;
import com.example.springclass2.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Slf4j
public class BeanConfig {

    @Bean
    @Profile("dev")
    public UserService getBeanDev(){
        log.info("This is bean for dev");
        return new UserServiceImpl();
    }

    @Bean
    @Profile("staging")
    public UserService getBeanStaging(){
        log.info("This is bean for staging");
        return new UserServiceImpl();
    }

    @Bean
    @Profile("h2")
    public UserService getBeanH2(){
        log.info("This is bean for h2");
        return new UserServiceImpl();
    }
}
