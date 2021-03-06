package com.lgkj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author dty
 */
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("zk")
    public String getInfo(){
        return "SpringCloud with zk " +  serverPort + " " + UUID.randomUUID();
    }
}
