package com.wsj.wanka.service;

import com.wsj.wanka.bean.UserInfo;

public interface UserInfoService {
    UserInfo getUserInfo(String userName , String userPass);
}
