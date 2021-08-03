package com.hxl.dynamic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User extends SupperEntity{

    private String username;
    private String password;


    private String tableName;
}
