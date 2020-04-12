package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * @author 邢立伟20165939
 * @create 2020/4/10 - 16:02
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
