package com.hxl.dynamic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxl.dynamic.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserMapper extends BaseMapper<User> {

    @Update("<script>" +
            "create table ${tableName} (" +
            "id bigint NOT NULL AUTO_INCREMENT comment 'id'," +
            "`username` varchar(50)  comment '用户名'," +
            "`password` varchar(50)  comment '密码'," +
            "`create_time` timestamp default CURRENT_TIMESTAMP comment '创建时间'," +
            "`update_time` timestamp default CURRENT_TIMESTAMP comment '更新时间'," +
            "primary key (id)" +
            ")ENGINE=INNODB DEFAULT CHARSET=utf8 comment '用户表';" +
            "</script>")
    int createTable(String tableName);


    @Insert("<script>" +
            "insert into ${tableName} (username,password) values (#{user.username},#{user.password}); " +
            "</script>")
    int saveByTableName(@Param("tableName") String tableName,@Param("user")  User user);
}
