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
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("get/{id}")
    public CallResult get(@PathVariable("id") Long id) {
        Payment payment = paymentService.get(id);
        return CallResult.success("success," + "端口：" + serverPort, payment);
    }
    @PostMapping("create")
    public CallResult save(@RequestBody Payment payment){
        paymentService.save(payment);
        return CallResult.success();
    }

    @GetMapping("discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services){
            log.info("*****element:{}", service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("PAYMENTAPP");
        for (ServiceInstance instance : instances){
            log.info("服务：" + instance.getInstanceId() + " " + instance.getHost()  + " " +  instance.getPort() + " " +instance.getUri());
        }
        return discoveryClient;
    }

    @GetMapping("timeout")
    public String timeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
