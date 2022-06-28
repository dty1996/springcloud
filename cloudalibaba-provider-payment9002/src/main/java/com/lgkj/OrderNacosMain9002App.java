package com.lgkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dty
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain9002App {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain9002App.class, args);
    }
}
