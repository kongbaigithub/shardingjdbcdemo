package com.hxl.dynamic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxl.dynamic.entity.User;
import com.hxl.dynamic.mapper.UserMapper;
import com.hxl.dynamic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int createTable(String tableName) {
        return userMapper.createTable(tableName);
    }

    @Override
    public void save(String tableName, User user) {
        userMapper.saveByTableName(tableName,user);
    }
}
