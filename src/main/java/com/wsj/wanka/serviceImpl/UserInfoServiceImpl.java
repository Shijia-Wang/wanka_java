package com.wsj.wanka.serviceImpl;

import com.wsj.wanka.bean.UserInfo;
import com.wsj.wanka.dao.UserInfoMapper;
import com.wsj.wanka.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfo(String userName, String userPass) {
        return userInfoMapper.getUserInfo(userName,userPass);
    }
}
