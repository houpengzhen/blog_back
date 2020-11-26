package com.blog.controller;

import cn.hutool.core.lang.Assert;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blog.common.dto.LoginDto;
import com.blog.common.lang.Result;
import com.blog.entity.User;
import com.blog.service.UserService;
import com.blog.util.JwtUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class AccountController {

    @Autowired
    UserService userService;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/login")
    public Result login(@Validated @RequestBody LoginDto loginDto, HttpServletResponse response){
        User user = userService.getOne(new QueryWrapper<User>().eq("uaccount", loginDto.getUaccount()));
        Assert.notNull(user,"用户不存在");

        System.out.println(SecureUtil.md5(loginDto.getUpwd()));
        System.out.println(SecureUtil.md5(user.getUpwd()));
        if(!SecureUtil.md5(user.getUpwd()).equals(SecureUtil.md5(loginDto.getUpwd()))){
            return Result.callBackFail("密码不正确");
        }

        String jwtToken = jwtUtils.generateToken(user.getUid().toString());
        response.setHeader("Authorization",jwtToken);
        response.setHeader("Access-control-Expose-Headers","Authorization");
        // return Result.callBackSuccess(MapUtil.builder().put("id",user.getUid()));
        return Result.callBackSuccess(user);
    }

    @GetMapping("/logout")
    public Result logout(){
        SecurityUtils.getSubject().logout();
        return Result.callBackSuccess(null);
    }
}
