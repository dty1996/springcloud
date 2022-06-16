package com.lgkj.serivce;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dty
 */
@Component
@FeignClient(value = "PaymentApp",fallback = PaymentHystrixService.class)
public interface PaymentService {
    /**
     * 获取信息
     * @return
     */
    @GetMapping("/payment/getInfo")
    String getInfo();

    /**
     * 获取超时信息
     * @return
     */
    @GetMapping("/payment/getTimeoutInfo")
    String getTimeoutInfo();
}
