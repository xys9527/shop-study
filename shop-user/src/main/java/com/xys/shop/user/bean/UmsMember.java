package com.xys.shop.user.bean;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class UmsMember implements Serializable {
    //配置通用mapper需要加 主键和主键返回策略
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private int status;
    private Date createTime;
    private String icon;
    private int gender;
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private int sourceType;
    private int integration;
    private int growth;
    private int luckeyCount;
    private int historyIntegration;
}
