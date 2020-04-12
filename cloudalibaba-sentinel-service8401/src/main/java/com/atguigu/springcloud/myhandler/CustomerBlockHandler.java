package com.atguigu.springcloud.myhandler;

import cn.hutool.core.util.IdUtil;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author 邢立伟20165939
 * @create 2020/4/10 - 12:12
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult<>(444, "按客户自定义的",new Payment(2020L, IdUtil.simpleUUID()));
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult<>(444, "按客户自定义的2",new Payment(2020L, IdUtil.simpleUUID()));
    }
}
