package com.panxiang.controller;

import com.panxiang.domain.User;
import com.panxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by panxiang on 2017-06-25.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(@RequestParam("name") String name) {
        return userService.getUserByName(name);
    }
}
