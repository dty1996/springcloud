package com.lgkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author dty
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001App {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001App.class, args);
    }
}
