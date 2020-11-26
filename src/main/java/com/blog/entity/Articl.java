package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("articl")
public class Articl {

    @TableId(value = "atcid",type= IdType.AUTO)
    private Integer atcid;
    private Integer uid;
    private Integer cateid;
    private String atctitle;
    private String atccon;
    private String atcpic;
    private Integer atcpageviews;
    private Integer atcstar;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatetime;
    private Integer state;
    private String description;

    public Integer getAtcid() {
        return atcid;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getCateid() {
        return cateid;
    }

    public String getAtctitle() {
        return atctitle;
    }

    public String getAtccon() {
        return atccon;
    }

    public String getAtcpic() {
        return atcpic;
    }

    public Integer getAtcpageviews() {
        return atcpageviews;
    }

    public Integer getAtcstar() {
        return atcstar;
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

    public void setAtcid(Integer atcid) {
        this.atcid = atcid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public void setAtctitle(String atctitle) {
        this.atctitle = atctitle;
    }

    public void setAtccon(String atccon) {
        this.atccon = atccon;
    }

    public void setAtcpic(String atcpic) {
        this.atcpic = atcpic;
    }

    public void setAtcpageviews(Integer atcpageviews) {
        this.atcpageviews = atcpageviews;
    }

    public void setAtcstar(Integer atcstar) {
        this.atcstar = atcstar;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
