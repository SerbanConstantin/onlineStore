package com.rosu.onlinestore.repository;

import com.rosu.onlinestore.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer > {

//    List<ProductCategory> findByCategoryTypeInOrderByCategoryTypeAsc(List<Integer> categoryTypes);
//
//    List<ProductCategory> findAllByOrderByCategoryType();

    ProductCategory findByCategoryType(Integer categoryType);
}
