package com.rosu.onlinestore.repository;

import com.rosu.onlinestore.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer > {
}
