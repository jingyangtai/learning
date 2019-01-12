package com.example.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.beans.user.User;
import com.example.service.user.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Reference//(url = "dubbo://localhost:20880")
    private UserService userSVI;

    @RequestMapping(value = "/queryUserById/{id}",method = RequestMethod.GET)
    public User queryUserById(@PathVariable Long id){
        return userSVI.queryById(id);
    }

}
