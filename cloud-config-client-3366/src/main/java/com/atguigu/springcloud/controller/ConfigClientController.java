package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;
    @Value("${server.port}")
    private String serverport;
    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "serverport:"+serverport+"      configinfor"+configInfo;
    }

}