package com.mtx.sell.model;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProductCategory {

    @Id
    private int categoryId;

    private String categoryName;

    private String categoryType;

}
