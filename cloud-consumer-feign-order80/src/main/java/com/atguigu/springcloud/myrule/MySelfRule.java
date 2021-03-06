package com.atguigu.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 邢立伟20165939
 * @create 2020/3/15 - 21:04
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}
