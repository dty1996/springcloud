package com.lgkj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RefreshScope 手动重启
 * @author dty
 */
@RestController
@RequestMapping
@RefreshScope
public class ConfigClientController {


    @Value("${config.info}")
    private String configInfo;

    @GetMapping("getInfo")
    public String getInfo(){
        return configInfo;
    }
}
