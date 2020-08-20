package com.camel.kafka.dynamic.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class KafkaCamelApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaCamelApplication.class, args);
    }
}
