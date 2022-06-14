package com.lgkj.controller;


import com.lgkj.common.CallResult;
import com.lgkj.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author dty
 */
@RestController
@RequestMapping("consumer")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "http://PaymentApp";

    @GetMapping("get/{id}")
    public CallResult get(@PathVariable Long id){
        return restTemplate.getForObject(URL + "/payment/get/" +id, CallResult.class);
    }

    @GetMapping("create")
    public CallResult create( Payment payment){
        return restTemplate.postForObject(URL + "/payment/create", payment, CallResult.class );
    }
    @GetMapping("getEntity/{id}")
    public CallResult getEntity(@PathVariable Long id){
        ResponseEntity<CallResult> entity = restTemplate.getForEntity(URL + "/payment/get/" + id, CallResult.class);
        if (entity.getStatusCode().is2xxSuccessful()){
            return  entity.getBody();
        } else {
            return CallResult.fail();
        }
    }

    @GetMapping("createEntity")
    public CallResult createEntity(Payment payment){
        ResponseEntity<CallResult> responseEntity = restTemplate.postForEntity(URL + "/payment/create", payment, CallResult.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return CallResult.fail();
        }
    }

}
