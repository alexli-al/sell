package com.mtx.sell.service;

import com.mtx.sell.model.ProductCategory;

public interface ProductCategoryService {

    public void save(ProductCategory productCategory);

    public void findAll();

    public void update(ProductCategory productCategory);


}
