package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 邢立伟20165939
 * @create 2020/3/29 - 15:34
 */
@RestController
public class SendMessageController {
    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}
