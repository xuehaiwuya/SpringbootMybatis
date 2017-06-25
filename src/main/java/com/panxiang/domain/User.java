package com.panxiang.domain;

import java.io.Serializable;

/**
 * Created by panxiang on 2017-06-25.
 */
public class User implements Serializable {
    private long id; //主键id
    private String name;//用户名
    private String pwd;//密码
    private String email;//邮箱

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
