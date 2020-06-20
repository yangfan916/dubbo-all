package com.yangfan.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yangfan.inter.user.IUserService;

@Service(version = "v1.0.0")
public class UserServiceImpl implements IUserService {
    @Override
    public String hello(String name) {
        System.out.println("old version springboot hello......");
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "old version springboot hello " + name;
    }
}
