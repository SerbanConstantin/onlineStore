package com.rosu.onlinestore.service;


import com.rosu.onlinestore.model.ProductCategory;



public interface CategoryService {

//    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

//    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
