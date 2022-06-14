package com.lgkj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dty
 */
@RestController
@RequestMapping("consumer")
public class OrderController {
    private static final String URL ="http://PaymentApp";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("zk")
    public String getString(){
        return restTemplate.getForObject(URL + "/payment/zk", String.class);
    }
}
