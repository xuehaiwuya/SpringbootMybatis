package com.panxiang.service.impl;

import com.panxiang.dao.UserDao;
import com.panxiang.domain.User;
import com.panxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by panxiang on 2017-06-25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }
}
