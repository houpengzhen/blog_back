package com.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.blog.mapper")
public class BlogbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogbackApplication.class, args);
    }

}
