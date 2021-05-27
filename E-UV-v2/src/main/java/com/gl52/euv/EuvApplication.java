package com.gl52.euv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/*
*spirngboot 启动类
* */
@SpringBootApplication
@ServletComponentScan //Spring boot启动时扫描 @servlet,@WebFilter注解 并实例化
@MapperScan("com.gl52.euv.mapper")//指定扫描接口与映射配置文件
public class EuvApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuvApplication.class, args);
    }

}
