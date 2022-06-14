package com.lgkj.controller;

import com.lgkj.common.CallResult;
import com.lgkj.entity.Payment;
import com.lgkj.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author dty
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

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
}
