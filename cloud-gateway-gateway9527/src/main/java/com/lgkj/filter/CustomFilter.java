package com.lgkj.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author dty
 */
@Component
@Slf4j
public class CustomFilter implements GlobalFilter, Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (StringUtils.isBlank(username)){
            log.info("**********没有username,不能访问");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            //返回
            return exchange.getResponse().setComplete();
        }
        //传递给下一个过滤器
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
