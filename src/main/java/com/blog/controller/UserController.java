package com.blog.controller;

import com.blog.common.lang.Result;
import com.blog.entity.User;
import com.blog.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequiresAuthentication
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable("id") Integer id) {
        return Result.callBackSuccess(userService.getById(id));
    }

    @PostMapping(value = "/save")
    public Result save(@RequestBody @Validated User user) {
        return Result.callBackSuccess(userService.save(user));
    }
}
