package com.lgkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dty
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002App {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002App.class, args);
    }
}
