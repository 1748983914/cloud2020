package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 邢立伟20165939
 * @create 2020/3/31 - 16:12
 */
@Service
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/payment/nacos/{id}", consumes = "application/json")
    public CommonResult getPayment(@PathVariable("id") Long id);

}
