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
public class OrderNacosController {


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/provider/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return "nacos registry,serverPort: " + serverPort  + " id: " + id ;
    }
}
