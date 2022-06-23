package com.lgkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dty
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3355App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3355App.class, args);
    }
}
