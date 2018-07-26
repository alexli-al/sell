package com.mtx.sell.repository;

import com.mtx.sell.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

    public List<UserEntity> findByUsername(String username);
}
