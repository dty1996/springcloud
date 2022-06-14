package com.lgkj;

import com.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PaymentApp", configuration = MyselfRule.class)
public class Order80App {
    public static void main(String[] args) {
        SpringApplication.run(Order80App.class, args);
    }
}
