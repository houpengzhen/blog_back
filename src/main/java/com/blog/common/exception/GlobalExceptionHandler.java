package com.blog.common.exception;

import com.blog.common.lang.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.ShiroException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = ShiroException.class)
    public Result handler(ShiroException e){
        log.error("ShiroException：--》", e);
        return Result.callBackFail("401",e.getMessage());
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = RuntimeException.class)
    public Result handler(RuntimeException e){
        log.error("RuntimeException：--》", e);
        return Result.callBackFail(e.getMessage());
    }


    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = IllegalArgumentException.class)
    public Result handler(IllegalArgumentException e){
        log.error("IllegalArgumentException：--》", e);
        return Result.callBackFail(e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = NullPointerException.class)
    public Result handler(NullPointerException e){
        log.error("NullPointerException：--》", e);
        return Result.callBackFail(e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = ArrayIndexOutOfBoundsException.class)
    public Result handler(ArrayIndexOutOfBoundsException e){
        log.error("ArrayIndexOutOfBoundsException：--》", e);
        return Result.callBackFail(e.getMessage());
    }


}
