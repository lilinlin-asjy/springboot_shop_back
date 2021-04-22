package com.asjy.dao;

import com.asjy.po.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;

import java.util.List;


public interface UserMapper extends MyMapper<User> {
    List<User> getAllUser();
}