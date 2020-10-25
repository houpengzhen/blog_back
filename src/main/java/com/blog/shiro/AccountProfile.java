package com.blog.shiro;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AccountProfile implements Serializable {

    private Integer uid;
    private String uavatar;
    private String unickname;
    private String uaccount;
    private String upwd;
    private String uname;
    private String ucode;
    private Date createtime;
    private Date updatetime;
    private Integer state;


    public Integer getUid() {
        return uid;
    }

    public String getUavatar() {
        return uavatar;
    }

    public String getUnickname() {
        return unickname;
    }

    public String getUaccount() {
        return uaccount;
    }

    public String getUpwd() {
        return upwd;
    }

    public String getUname() {
        return uname;
    }

    public String getUcode() {
        return ucode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public Integer getState() {
        return state;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUavatar(String uavatar) {
        this.uavatar = uavatar;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
