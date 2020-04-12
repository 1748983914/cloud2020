package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 邢立伟20165939
 * @create 2020/4/10 - 15:50
 */
@Mapper
public interface OrderDao {
    //1、新建订单
    void create(Order order);

    //2、修改订单状态，从0为1

    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
