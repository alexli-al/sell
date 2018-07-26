package com.mtx.sell.service;

import com.mtx.sell.model.UserEntity;

import java.util.List;

public interface UserService {

    public List<UserEntity> findByUsername(String username);

    public Long save(UserEntity user);
}
