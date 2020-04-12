package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 邢立伟20165939
 * @create 2020/3/18 - 20:02
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
     @GetMapping(value = "/payment/get/{id}",consumes = "application/json")
      public CommonResult getPaymentById(@PathVariable("id") Long id) ;

}
