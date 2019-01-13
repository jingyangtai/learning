package com.example.serviceImpl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.beans.user.User;
import com.example.dao.UserDao;
import com.example.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User queryById(Long id) {
        return userDao.queryById(id);
    }
}
