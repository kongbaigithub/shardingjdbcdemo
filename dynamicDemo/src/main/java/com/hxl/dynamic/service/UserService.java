package com.hxl.dynamic.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hxl.dynamic.entity.User;

public interface UserService extends IService<User> {

    int createTable(String tableName);

    void save(String tableName, User user);
}
