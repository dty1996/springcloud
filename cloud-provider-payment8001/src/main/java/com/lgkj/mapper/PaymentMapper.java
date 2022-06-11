package com.lgkj.mapper;

import com.lgkj.model.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author dty
 */
@Mapper
public interface PaymentMapper {
    /**
     * 获取订单信息
     * @param id
     * @return
     */
    Payment get(Long id);

    /**
     * 保存订单信息
     * @param payment
     * @return
     */
    int save(Payment payment);
}
