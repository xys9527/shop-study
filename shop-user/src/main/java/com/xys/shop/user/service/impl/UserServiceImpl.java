package com.xys.shop.user.service.impl;

import com.xys.shop.user.bean.UmsMember;
import com.xys.shop.user.mapper.UserMapper;
import com.xys.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }
}
