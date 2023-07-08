package com.example.pidev_gestion_immo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan({"com.example.pidev_gestion_immo.services","com.example.pidev_gestion_immo.controller"})
public class PidevGestionImmoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PidevGestionImmoApplication.class, args);
    }
    @Configuration
    public class WebConfig extends WebMvcConfigurerAdapter {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
        }
    }
}
