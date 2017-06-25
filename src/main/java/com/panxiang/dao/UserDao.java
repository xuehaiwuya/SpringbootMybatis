package com.panxiang.dao;

import com.panxiang.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by panxiang on 2017-06-25.
 */
@Mapper
public interface UserDao {

    User getUserByName(String name);
}
