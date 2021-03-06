package com.example.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.beans.user.User;
import com.example.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference
    private UserService userSVI;

    @RequestMapping(value = "/queryUserById/{id}",method = RequestMethod.GET)
    public User queryUserById(@PathVariable Long id){
        return userSVI.queryById(id);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public int updateUser(User user){
         return userSVI.updateUser(user);
    }
}
