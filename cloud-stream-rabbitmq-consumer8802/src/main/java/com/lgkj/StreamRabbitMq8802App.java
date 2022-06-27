package com.lgkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dty
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitMq8802App {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitMq8802App.class, args);
    }
}
