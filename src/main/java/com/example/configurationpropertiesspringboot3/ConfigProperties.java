package com.example.configurationpropertiesspringboot3;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {
    String hostName;
    int port;
    String from;
}
