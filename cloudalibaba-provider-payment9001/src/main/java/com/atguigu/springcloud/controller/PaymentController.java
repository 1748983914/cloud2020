package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author 邢立伟20165939
 * @create 2020/3/31 - 15:31
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;
    public static HashMap<Long, Payment> hashmap=new HashMap<>();
    static {
        hashmap.put(1L,new Payment(1L,"111111111111"));
        hashmap.put(2L,new Payment(2L,"2222222222"));
        hashmap.put(3L,new Payment(3L,"333333333333"));

    }
    @GetMapping("/payment/nacos/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        Payment payment=hashmap.get(id);
        CommonResult<Payment> paymentCommonResult = new CommonResult<>(200, "from mysql,portserver:" + serverPort, payment);
        return paymentCommonResult;
    }
}