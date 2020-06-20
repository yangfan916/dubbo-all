package com.yangfan.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yangfan.inter.user.IUserService;

@Service(version = "v2.0.0")
public class UserServiceImpl2 implements IUserService {
    @Override
    public String hello(String name) {
        System.out.println("new version springboot hello......");
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "new version springboot hello " + name;
    }
}
