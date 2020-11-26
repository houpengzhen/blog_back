package com.blog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User {

    @TableId
    private Integer uid;
    private String uavatar;
    private String unickname;
    private String uaccount;
    private String upwd;
    private String uname;
    private String ucode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd")
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
