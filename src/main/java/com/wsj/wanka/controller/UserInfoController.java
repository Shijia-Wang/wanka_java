package com.wsj.wanka.controller;

import com.alibaba.fastjson.JSON;
import com.wsj.wanka.bean.UserInfo;
import com.wsj.wanka.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/main")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

//    @RequestMapping("/login")
//    public String login(){
//        return "login";
//    }

    @PostMapping(value = "/loginIn")
    @ResponseBody
    public String loginIn(String userName , String userPass) {
        UserInfo userInfo = userInfoService.getUserInfo(userName,userPass);
        if(userInfo != null){
            return "success";
        }else{
            return "error";
        }
    }


}
