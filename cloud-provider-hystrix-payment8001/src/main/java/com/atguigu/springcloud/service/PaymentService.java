package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 邢立伟20165939
 * @create 2020/3/19 - 14:06
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(Integer id);
}
