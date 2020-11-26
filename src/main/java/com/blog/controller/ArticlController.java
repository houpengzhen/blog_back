package com.blog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.blog.common.lang.Result;
import com.blog.entity.Articl;
import com.blog.entity.User;
import com.blog.service.ArticlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Date;


@RestController
public class ArticlController {

    @Autowired
    ArticlService articlService;

    @GetMapping("/getAllArticl")
    public Result getAllArticl(@RequestParam(defaultValue = "1") Integer currentPage){
        Page page = new Page(currentPage, 1);
        IPage pageData = articlService.page(page, new QueryWrapper<Articl>().orderByDesc("createtime"));
        return Result.callBackSuccess(pageData);
    }

    @PostMapping("/blog/edit")
    public Result editArticl(@Validated @RequestBody Articl articl){
        articl.setUid(1);
        articl.setCateid(1);
        articl.setCreatetime(new Date());
        articl.setUpdatetime(new Date());
        articl.setState(1);
        boolean flag = articlService.save(articl);
        return Result.callBackSuccess(flag);
    }


}
