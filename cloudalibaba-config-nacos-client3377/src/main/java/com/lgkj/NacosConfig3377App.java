package com.lgkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dty
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig3377App {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfig3377App.class, args);
    }
}
