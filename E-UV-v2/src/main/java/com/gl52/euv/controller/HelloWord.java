package com.gl52.euv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.DataSource;
import java.io.File;

//@RestController//@controller +@responseBody
@Controller
public class HelloWord {

    @RequestMapping("/helloWord")
    public String showHelloWord(){
        return "hello";
    }

    @RequestMapping("/login.do")
    public String showPage(){
        return "login.html";
    }

    /**
     * 文件上传
     */
    @PostMapping("/upload")
    public String fileUpload(MultipartFile file) throws Exception{
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("g:/"+file.getOriginalFilename()));
        return "ok";
    }
    @Autowired
    private DataSource dataSource;

    @GetMapping("/showInfo")
    public String showInfo(){
        return "ok";
    }
}
