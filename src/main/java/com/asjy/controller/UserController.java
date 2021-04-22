package com.asjy.controller;

import com.asjy.po.User;
import com.asjy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lilinlin
 * @Date: 2021/4/22
 * @Description: com.asjy.controller
 * @version: 1.0
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
         return userService.getAllUser();
    }

    @RequestMapping("/toUserList")
    public String toUserList(Model model){
        model.addAttribute("name","tom");
        List<User> allUser = userService.getAllUser();

        model.addAttribute("users",allUser);
        return "userList";
    }

    @RequestMapping("/addUser")
    public List<String> addUser(@Validated User user, BindingResult br){
        System.out.println(user);
        List<ObjectError> allErrors = br.getAllErrors();
        List<String> erroList = new ArrayList<>();

        for (ObjectError allError : allErrors) {
            String code = allError.getCode();

            String defaultMessage = allError.getDefaultMessage();
            erroList.add( allError.getObjectName()+":"+defaultMessage);
        }

        return erroList;
    }

}