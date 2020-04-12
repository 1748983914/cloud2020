package com.atguigu.springcloud.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author 邢立伟20165939
 * @create 2020/3/13 - 11:14
 */
@RestController
@Slf4j
public class PaymentController {
    private static ZooKeeper zooKeeper;
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk() throws Exception {

        return "springcloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID().toString();
    }



}
