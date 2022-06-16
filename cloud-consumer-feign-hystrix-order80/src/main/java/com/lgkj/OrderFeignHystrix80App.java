package com.lgkj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dty
 */
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
@EnableCircuitBreaker
public class OrderFeignHystrix80App {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrix80App.class, args);
    }
}
