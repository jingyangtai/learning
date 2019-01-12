package com.example.serviceImpl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.beans.user.User;
import com.example.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User queryById(Long id) {
        User user=new User();
        user.setId(1L);
        user.setName("uubird");
        user.setAge(25);
        return user;
    }
}
