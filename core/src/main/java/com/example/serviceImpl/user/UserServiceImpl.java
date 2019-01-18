package com.example.serviceImpl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.beans.user.User;
import com.example.core.com.example.dynamicDataSource.DataSourceKey;
import com.example.core.com.example.dynamicDataSource.TargetDataSource;
import com.example.dao.user.UserDao;
import com.example.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService  {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;


    @Override
    @TargetDataSource(dataSourceKey =DataSourceKey.DS_SLAVE)
    public User queryById(Long id) {
        return userDao.queryById(id);
    }

    @Override
    @Transactional
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
}
