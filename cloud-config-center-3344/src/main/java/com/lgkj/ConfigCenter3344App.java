package com.lgkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dty
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigCenter3344App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3344App.class, args);
    }
}
