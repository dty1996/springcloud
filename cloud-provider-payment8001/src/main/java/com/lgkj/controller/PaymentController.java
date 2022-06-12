package com.lgkj.controller;

import com.lgkj.common.CallResult;
import com.lgkj.entity.Payment;
import com.lgkj.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author dty
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("get/{id}")
    public CallResult get(@PathVariable Long id) {
        Payment payment = paymentService.get(id);
        return new CallResult(200, "success", payment);
    }
    @PostMapping("create")
    public CallResult save(@RequestBody Payment payment){
        paymentService.save(payment);
        return CallResult.success();
    }
}
