package com.mtx.sell.repository;

import com.mtx.sell.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepoTest {

    @Autowired
    private  ProductCategoryRepo productCategoryRepo;

    @Test
    public void testSave(){

        ProductCategory  productCategory = new ProductCategory("每日精选", "4");
        ProductCategory  returnProductCategory = productCategoryRepo.save(productCategory);
        Assert.assertNotNull(returnProductCategory);
    }
}