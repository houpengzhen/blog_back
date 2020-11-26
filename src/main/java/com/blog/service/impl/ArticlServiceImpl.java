package com.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.entity.Articl;
import com.blog.mapper.ArticlMapper;
import com.blog.service.ArticlService;
import org.springframework.stereotype.Service;

@Service
public class ArticlServiceImpl extends ServiceImpl<ArticlMapper, Articl> implements ArticlService {
}
