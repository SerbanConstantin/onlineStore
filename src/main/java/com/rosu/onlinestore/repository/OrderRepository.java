package com.rosu.onlinestore.repository;


import com.rosu.onlinestore.model.OrderMain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderMain, Integer> {
}
