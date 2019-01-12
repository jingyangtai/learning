package com.example.serviceImpl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.beans.user.User;
import com.example.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public User queryById(Long id) {
        User user=new User();
        user.setId(1L);
        user.setName("uubird");
        user.setAge(25);
        logger.info("queryById"+user.getName());
        return user;
    }
}
