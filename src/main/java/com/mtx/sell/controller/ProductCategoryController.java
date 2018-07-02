package com.mtx.sell.controller;

import com.mtx.sell.model.ProductCategory;
import com.mtx.sell.service.ProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@Api(description="类目管理")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @ApiOperation(value = "查询所有类目", nickname = "查询所有类目")
    @RequestMapping(value = "/findAll", method =  RequestMethod.GET)
    public List<ProductCategory> findAll(){
       return  productCategoryService.findAll();
    }

    @ApiOperation(value = "添加类目", nickname = "添加类目")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ProductCategory add(){
        ProductCategory productCategory = new ProductCategory("男生专场", "2");
       return  productCategoryService.save(productCategory);
    }
}
