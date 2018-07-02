package com.mtx.sell.repository;

import com.mtx.sell.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ProductCategoryRepo extends JpaRepository<ProductCategory, Integer>{

}