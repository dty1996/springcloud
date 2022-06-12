package com.lgkj.service;


import com.lgkj.entity.Payment;

/**
 * @author dty
 */
public interface PaymentService {
    /**
     * 获得订单信息
     * @param id
     * @return
     */
    Payment get(Long id);
    /**
     * 保存订单信息
     * @param payment
     * @return
     */
    void save(Payment payment);
}
