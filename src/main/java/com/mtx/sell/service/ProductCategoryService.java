package com.mtx.sell.service;

import com.mtx.sell.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    public ProductCategory save(ProductCategory productCategory);

    public List<ProductCategory> findAll();

    public ProductCategory update(ProductCategory productCategory);


}
