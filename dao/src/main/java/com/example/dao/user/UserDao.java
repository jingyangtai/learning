package com.example.dao.user;

import com.example.beans.user.User;

public interface UserDao {

    User queryById(Long id);
}
