package com.lgkj.controller;

import com.lgkj.service.IMessageProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(1656383331);
        System.out.println(simpleDateFormat.format(date));
    }
}
