package com.atguigu.springcloud.service.Impl;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author 邢立伟20165939
 * @create 2020/3/29 - 15:27
 */
@EnableBinding(Source.class)//发送管道
public class MessageProviderImpl implements IMessageProvider {
    @Autowired
    private MessageChannel output;//消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("**********serial:"+serial);
        return null;
    }
}
