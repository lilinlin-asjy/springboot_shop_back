package com.asjy.dao;

import com.asjy.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: lilinlin
 * @Date: 2021/4/22
 * @Description: com.asjy.dao
 * @version: 1.0
 */
@Mapper
public interface UserDao {

    List<User> getAllUser();
}
