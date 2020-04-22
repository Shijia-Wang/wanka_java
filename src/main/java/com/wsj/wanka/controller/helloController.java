package com.wsj.wanka.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@MapperScan("com.wsj.wanka.dao")
public class helloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

}
