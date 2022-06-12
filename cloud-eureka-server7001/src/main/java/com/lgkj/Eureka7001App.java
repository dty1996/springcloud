package com.lgkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dty
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001App.class, args);
    }
}
