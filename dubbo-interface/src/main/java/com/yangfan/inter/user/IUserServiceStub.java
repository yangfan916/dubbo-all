package com.yangfan.inter.user;

public class IUserServiceStub implements IUserService {

    private final IUserService userService;

    //构造函数传入真正的远程代理对象
    public IUserServiceStub(IUserService userService) {
        this.userService = userService;
    }

    public String hello(String name) {
        if (name == null || "".equals(name.trim())){
            return "参数错误";
        }
        return userService.hello(name);
    }
}
