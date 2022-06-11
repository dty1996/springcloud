package com.lgkj.service.impl;

import com.lgkj.mapper.PaymentMapper;
import com.lgkj.model.entity.Payment;
import com.lgkj.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dty
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public Payment get(Long id) {
        return paymentMapper.get(id);
    }

    @Override
    public void save(String serial) {
        Payment payment = new Payment();
        payment.setSerial(serial);
        int count = paymentMapper.save(payment);
        if (count <= 0){
            throw new RuntimeException("插入失败");
        }
    }
}
