package com.lgkj.controller;

import com.lgkj.model.common.CallResult;
import com.lgkj.model.entity.Payment;
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

    @GetMapping("info/{id}")
    public CallResult get(@PathVariable Long id) {
        Payment payment = paymentService.get(id);
        return new CallResult(200, "success", payment);
    }
    @PostMapping("save")
    public CallResult save(String serial){
        paymentService.save(serial);
        return new CallResult(200, "success");
    }
}
