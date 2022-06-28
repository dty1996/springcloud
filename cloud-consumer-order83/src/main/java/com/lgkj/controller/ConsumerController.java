package com.lgkj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dty
 */
@RestController
@RequestMapping
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${nacos-server-url}")
    private String url;


    @GetMapping("/consumer/payment/get/{id}")
    public String orderConsumer(@PathVariable("id") Long id) {
        return restTemplate.getForObject(url + "/provider/payment/nacos/" + id, String.class);
    }
}
