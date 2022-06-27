package com.lgkj.service.impl;

import com.lgkj.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

import java.util.UUID;

/**
 * @EnableBinding 可以理解为是一个消息的发送管道定义
 * @author dty
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    /**
     * 消息的发送管道
     */
    @Resource
    @Output(Source.OUTPUT)
    private MessageChannel output;

    @Override
    public String sendMessage() {
        String serial = UUID.randomUUID().toString();
        System.out.println("***serial:" + serial);

        this.output.send(MessageBuilder.withPayload(serial).build());
        return serial;
    }
}
