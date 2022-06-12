package com.lgkj.controller;


import com.lgkj.common.CallResult;
import com.lgkj.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "http://localhost:8001/payment";

    @GetMapping("get/{id}")
    public CallResult get(@PathVariable Long id){
        return restTemplate.getForObject(URL + "/get/" +id, CallResult.class);
    }

    @GetMapping("create")
    public CallResult create( Payment payment){
        return restTemplate.postForObject(URL + "/create", payment, CallResult.class );
    }

}
