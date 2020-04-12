package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 邢立伟20165939
 * @create 2020/3/13 - 13:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OderZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OderZKMain80.class,args);
    }
}
