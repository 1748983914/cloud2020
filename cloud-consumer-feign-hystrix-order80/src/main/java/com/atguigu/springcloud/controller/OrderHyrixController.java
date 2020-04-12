package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.hystrix.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 邢立伟20165939
 * @create 2020/3/20 - 18:53
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHyrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_OK(id);
        return s;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
   /* @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })*/
   @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){

        String s = paymentHystrixService.paymentInfo_TimeOut(id);
        return s;
    }
    public String paymentInfo_TimeOutHandler(Integer id) {
        return "消费端出错了";
    }
    //下面是全局fallback
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试o(╥﹏╥)o";
    }
}
