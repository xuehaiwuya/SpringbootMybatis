package com.panxiang.service.impl;

import com.panxiang.dao.UserDao;
import com.panxiang.domain.User;
import com.panxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


/**
 * Created by panxiang on 2017-06-25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Cacheable(value = "RedisCache",key = "'getUserByName_'+#name")
    @Override
    public User getUserByName(String name) {
        System.out.println("数据库查询。。。");
        return userDao.getUserByName(name);
    }
}
