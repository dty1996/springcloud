package com.lgkj;
;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dty 要加上 @EnableFeignClients注解 默认开启轮询
 */
@SpringBootApplication
@EnableFeignClients
public class Order80App {
    public static void main(String[] args) {
        SpringApplication.run(Order80App.class, args);
    }
}
