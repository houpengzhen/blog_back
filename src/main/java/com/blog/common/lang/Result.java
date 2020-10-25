package com.blog.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author JackHou
 * 处理返回前端页面的消息
 */
@Data
public class Result implements Serializable {

    // 异常数据id
    private String code;
    // 异常消息
    private String msg;
    private Object data;

    // SUCCESS
    public static Result callBackSuccess(Object data){
        return callBack(ErrorCodeConstants.CALL_BACK_SUCCESS_CODE,Constants.CALL_BACK_SUCCESS,data);
    }

    // ERROR
    public static Result callBackFail(String msg){
        return callBack(ErrorCodeConstants.CALL_BACK_ERROR_CODE,msg,null);
    }
    public static Result callBackFail(String errorCode, String msg){
        return callBack(ErrorCodeConstants.CALL_BACK_ERROR_CODE,msg,null);
    }

    // main Funciotn
    public static Result callBack(String code, String msg, Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }


    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
