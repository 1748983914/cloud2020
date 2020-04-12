package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 邢立伟20165939
 * @create 2020/3/6 - 20:21
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
