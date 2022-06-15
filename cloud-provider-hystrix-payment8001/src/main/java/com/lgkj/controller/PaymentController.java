package com.lgkj.controller;

import com.lgkj.common.CallResult;
import com.lgkj.entity.Payment;
import com.lgkj.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author dty
 */
@RestController
@RequestMapping
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/getInfo")
    public String getInfo(){
        return   "获得: " + serverPort + " 的消息";
    }

    @GetMapping("/payment/getTimeoutInfo")
    public String getTimeoutInfo(){
        Integer timeout = 3;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("获得延迟3s的消息");
        return "获得延时" + timeout + " 秒的信息";
    }

}
