package com.lgkj.controller;

import com.lgkj.serivce.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dty
 */
@RestController
@RequestMapping
@DefaultProperties
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/getInfo")
    String getInfo() {
        return paymentService.getInfo();
    }

    //    @HystrixCommand(fallbackMethod = "payment_Feedback", commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000") })
    @HystrixCommand
    @GetMapping("/payment/getTimeoutInfo")
    String getTimeoutInfo() {
        return paymentService.getTimeoutInfo();
    }
}