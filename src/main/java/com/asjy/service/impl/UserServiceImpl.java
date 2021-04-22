package com.asjy.service.impl;

import com.asjy.dao.UserDao;
import com.asjy.dao.UserMapper;
import com.asjy.po.User;
import com.asjy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: lilinlin
 * @Date: 2021/4/22
 * @Description: com.asjy.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}