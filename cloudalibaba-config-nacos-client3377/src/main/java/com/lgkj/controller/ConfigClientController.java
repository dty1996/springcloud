package com.lgkj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在控制器类中加入@RefreshScope注解使当前类下的配置支持nacos的动态刷新功能
 * @author dty
 */
@RestController
@RequestMapping
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo ;



    @GetMapping("config/info")
    public String getConfigInfo(){
        return configInfo;
    }

}
