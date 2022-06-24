package com.lgkj.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dty
 */
@RestController
@RequestMapping
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("getInfo")
    public String getInfo(){
        return configInfo;
    }
}
