package com.ivan.jenkins.controller;


import com.ivan.jenkins.entity.User;
import com.ivan.jenkins.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Ivan
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "获取所有用户信息",response = User.class)
    @GetMapping("getAll")
    public List<User> getAll() {
        return userService.list();
    }

}
