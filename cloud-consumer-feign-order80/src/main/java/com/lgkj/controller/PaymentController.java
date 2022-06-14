package com.lgkj.controller;

import com.lgkj.common.CallResult;
import com.lgkj.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dty
 */
@RestController
@RequestMapping("consumer")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("get/{id}")
    public CallResult get(@PathVariable("id") Long  id){
        return paymentService.get(id);
    }
    @GetMapping("timeout")
    public String timeout(){
        return paymentService.timeout();
    }
}
