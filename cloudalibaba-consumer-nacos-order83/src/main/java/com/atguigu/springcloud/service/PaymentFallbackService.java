package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author 邢立伟20165939
 * @create 2020/4/10 - 13:50
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult getPayment(Long id) {
        return new CommonResult(444,"服务降级",new Payment(id,"error"));
    }
}
