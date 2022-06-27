package com.lgkj.controller;

import com.lgkj.service.IMessageProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dty
 */
@RestController
@RequestMapping
public class MessageController {
    @Resource
    private IMessageProvider messageProvider;

    @RequestMapping("sendMessage")
    public String sendMessage() {
        return messageProvider.sendMessage();
    }
}
