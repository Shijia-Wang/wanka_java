package com.wsj.wanka.dao;

import com.wsj.wanka.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    UserInfo getUserInfo(String userName,String userPass);
}
