package com.lgkj.service;

import com.lgkj.common.CallResult;
import com.lgkj.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author dty
 */
@FeignClient(value = "PaymentApp")
@Component
public interface PaymentService {

    /**
     * 获取订单
     * @param id
     * @return
     */
    @GetMapping("/payment/get/{id}")
    CallResult get(@PathVariable("id") Long  id);
}
