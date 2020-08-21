package com.rosu.onlinestore.repository;

import com.rosu.onlinestore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
