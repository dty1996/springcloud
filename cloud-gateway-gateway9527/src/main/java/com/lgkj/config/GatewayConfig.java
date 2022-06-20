package com.lgkj.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dty
 */
//@Configuration
public class GatewayConfig {

    /**
     * 路由匹配
     * lb为负载均衡
     * @param builder
     * @return
     */
//    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return  builder
                .routes()
//                .route("payment",
//                        r -> r.path("/guonei").uri("https://news.baidu.com"))
//                .route("payment_lb",
//                        r -> r.path("/payment/get/**").uri("lb://PaymentApp"))
                .build();

    }
}
