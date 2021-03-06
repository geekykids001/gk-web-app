package com.geekykids.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.geekykids"})
@EntityScan("com.geekykids.model")
@Configuration()
@EnableJpaRepositories("com.geekykids.repository") 
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
