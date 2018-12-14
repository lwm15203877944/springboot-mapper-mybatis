package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("queryAll")
    public String queryAll(HttpSession session,String name){
        List<User> list = userMapper.selectAll();
        System.out.println(list);
        System.out.println(name);
        session.setAttribute("list", list);
        return "index";
    }
}
