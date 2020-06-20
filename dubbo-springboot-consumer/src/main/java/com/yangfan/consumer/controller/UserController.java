package com.yangfan.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yangfan.inter.user.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    /**
     * 设置负载均衡
     * 超时机制
     * 多版本控制
     * 本地存根
     */
    @Reference(loadbalance = "roundrobin", timeout = 5000, version = "v2.0.0", stub = "com.yangfan.inter.user.IUserServiceStub")
    private IUserService iUserService;

    @RequestMapping("hello")
    public String hello(String name){
        return iUserService.hello(name);
    }
}
