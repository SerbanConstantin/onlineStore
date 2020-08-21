package com.rosu.onlinestore.repository;

import com.rosu.onlinestore.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
}
