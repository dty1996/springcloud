package com.lgkj.service.impl;

import com.lgkj.entity.Payment;
import com.lgkj.mapper.PaymentMapper;
import com.lgkj.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(rollbackFor = {})
    public void save(Payment payment) {

        int count = paymentMapper.save(payment);
        if (count <= 0){
            throw new RuntimeException("插入失败");
        }
    }
}
