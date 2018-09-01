package com.mtx.sell.service.impl;

import com.mtx.sell.model.UserEntity;
import com.mtx.sell.repository.UserRepo;
import com.mtx.sell.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<UserEntity> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public Long save(UserEntity user) {
        return userRepo.save(user).getId();
    }

    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> newUserList = new ArrayList<>();
        List<UserEntity> userList = userRepo.findAll();
        for(UserEntity user : userList){
            user.setCreatedDate(null);
            user.setLastModifiedDate(null);
            newUserList.add(user);
        }
        return newUserList;

    }
}
