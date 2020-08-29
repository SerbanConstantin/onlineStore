package com.rosu.onlinestore.service;


import com.rosu.onlinestore.model.User;



public interface UserService {
    User findOne(String email);

//    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
