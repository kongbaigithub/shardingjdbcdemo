package com.hxl.dynamic.controller;

import com.hxl.dynamic.entity.User;
import com.hxl.dynamic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/createTable")
    public String createTable(String tableName){
        userService.createTable(tableName);
        return "SUCCESS";
    }

    @PostMapping("/addUser")
    public String createTable(@RequestBody User user){
        userService.save(user.getTableName(),user);
        return "SUCCESS";
    }
}
