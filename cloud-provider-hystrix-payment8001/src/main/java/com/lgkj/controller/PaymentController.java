package com.lgkj.controller;

import com.lgkj.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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
        return   "获得: " + serverPort + " 的消息 " + UUID.randomUUID();
    }


    @HystrixCommand(fallbackMethod = "payment_Feedback", commandProperties = {
    @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000") })
    @GetMapping("/payment/getTimeoutInfo")
    public String getTimeoutInfo(){
        Integer timeout = 5;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("获得延迟5s的消息");
        return "获得延时" + timeout + " 秒的信息 " + "id；" + UUID.randomUUID();
    }

    public String payment_Feedback(){
        return  Thread.currentThread().getName()+ "服务超时";
    }

    /**
     * 开启服务熔断
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    @GetMapping("/payment/getInfoCB/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Long id){
       if (id < 0){
           throw new RuntimeException("******id不能微负数");
       }

        return Thread.currentThread().getName() + "\t" + "调用成功，流水号为: " + UUID.randomUUID();
    }

    public String paymentCircuitBreakerFallback(Long id){
        return "******id不能微负数";
    }

}
