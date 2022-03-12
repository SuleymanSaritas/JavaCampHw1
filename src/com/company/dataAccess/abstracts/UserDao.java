package com.company.dataAccess.abstracts;

import com.company.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void addUser(User user );
    void updateUser(User user);
    void deleteUser(User user);
    User getUserById(int id);
    List<User> getAll();
}
