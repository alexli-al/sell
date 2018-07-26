package com.mtx.sell.controller;

import com.mtx.sell.model.UserEntity;
import com.mtx.sell.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "用户管理")
@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/login")
    @ApiOperation(value = "登录", nickname = "登录")
    public boolean login(@RequestParam String username, @RequestParam String password){
        if("admin".equals(username) && password.equals(password)){
            return true;
        }
        return false;
    }

    @ApiOperation(value = "根据用户名查找",nickname = "根据用户名查找")
    @PostMapping(value = "/findByUsername")
    public List<UserEntity> findByUsername(@RequestParam String username){
        if("".equals(username)){
            throw new RuntimeException("用户名不能为空");
        }
        return userService.findByUsername(username);
    }

    @ApiOperation(value = "添加用户", nickname = "添加用户")
    @PostMapping(value = "/add")
    public Long add(@RequestBody UserEntity user){
        return userService.save(user);
    }
}
