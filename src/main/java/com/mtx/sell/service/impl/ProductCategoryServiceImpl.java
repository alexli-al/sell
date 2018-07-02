package com.mtx.sell.service.impl;

import com.mtx.sell.model.ProductCategory;
import com.mtx.sell.repository.ProductCategoryRepo;
import com.mtx.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepo productCategoryRepo;

    @Override
    public ProductCategory save(ProductCategory productCategory) {

      return productCategoryRepo.save(productCategory);
    }

    @Override
    public List<ProductCategory> findAll() {
       return  productCategoryRepo.findAll();
    }

    @Override
    public ProductCategory update(ProductCategory productCategory) {

       ProductCategory currentProducetCategory =  productCategoryRepo.findOne(productCategory.getCategoryId());
       currentProducetCategory.setCategoryName(productCategory.getCategoryName());
       currentProducetCategory.setCategoryType(productCategory.getCategoryType());
       return  productCategoryRepo.save(currentProducetCategory);

    }
}
