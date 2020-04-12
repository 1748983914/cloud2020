package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 邢立伟20165939
 * @create 2020/3/24 - 13:14
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fallback paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fallback paymentInfo_TimeOut";
    }
}
