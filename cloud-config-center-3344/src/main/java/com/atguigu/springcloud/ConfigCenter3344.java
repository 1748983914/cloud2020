package com.atguigu.springcloud;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.swing.*;

/**
 * @author 邢立伟20165939
 * @create 2020/3/28 - 10:25
 */
@SpringBootApplication
@EnableConfigServer
@EnableRabbit
public class ConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3344.class,args);
    }
}
