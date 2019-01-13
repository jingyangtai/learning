package com.example.dao;

import com.example.beans.user.User;

public interface  UserDao {

    User queryById(Long id);
}
