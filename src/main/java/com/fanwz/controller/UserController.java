package com.fanwz.controller;

import com.fanwz.entity.UserEntity;
import com.fanwz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fanwz on 2018/5/24.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserEntity> list()
    {
        return userService.list();
    }
}