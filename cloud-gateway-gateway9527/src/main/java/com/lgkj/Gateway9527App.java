package com.lgkj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dty
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527App {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527App.class, args);
    }
}
