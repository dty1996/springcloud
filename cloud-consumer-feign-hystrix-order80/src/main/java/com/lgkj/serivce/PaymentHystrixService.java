package com.lgkj.serivce;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dty
 */
@Component
public class PaymentHystrixService implements PaymentService{
    @Override
    public String getInfo() {
        return Thread.currentThread().getName() + " 服务已中断 ";
    }

    @Override
    public String getTimeoutInfo() {
        return Thread.currentThread().getName() + " 服务已中断 ";
    }
}
