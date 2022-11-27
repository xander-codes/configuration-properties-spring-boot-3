package com.example.configurationpropertiesspringboot3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ConfigurationPropertiesSpringBoot3 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationPropertiesSpringBoot3.class, args);
    }

    @Autowired
    private ConfigProperties configProperties;

    @GetMapping()
    public String getProps() {
        System.out.println("ConfigurationPropertiesSpringBoot3.getProps was called");
        return configProperties.hostName + " " + configProperties.port + " " + configProperties.from;
    }
}
