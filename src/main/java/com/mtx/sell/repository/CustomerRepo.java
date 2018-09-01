package com.mtx.sell.repository;

import com.mtx.sell.model.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepo extends MongoRepository<CustomerEntity, Long> {

        public CustomerEntity findByFirstName(String firstName);
        public List<CustomerEntity> findByLastName(String lastName);
}
