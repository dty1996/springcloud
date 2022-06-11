package com.lgkj.service;

import com.lgkj.model.entity.Payment;

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
     * @param serial
     * @return
     */
    void save(String serial);
}
