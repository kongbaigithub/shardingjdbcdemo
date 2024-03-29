package com.hxl.dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hxl.dynamic.mapper")
public class DynApplication {
    
    public static void main(String[] args) throws Exception {
    		SpringApplication.run(DynApplication.class, args);
    	}
}
