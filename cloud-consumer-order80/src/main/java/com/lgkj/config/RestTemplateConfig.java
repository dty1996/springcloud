package com.lgkj.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author dty
 */
@Configuration
public class RestTemplateConfig {
    /**
     * 返回restTemplate,开启负载均衡（轮询)  @LoadBalanced
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
