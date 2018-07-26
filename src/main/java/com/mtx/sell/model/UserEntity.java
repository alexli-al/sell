package com.mtx.sell.model;

import javax.persistence.Entity;

@Entity
public class UserEntity  extends  EntityBase{

    private String username;

    private String password;

    public UserEntity(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
