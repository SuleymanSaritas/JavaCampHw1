package com.company.business.abstracts;

import com.company.entities.concretes.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void Login (User user ) ;
    void SignupWithGoogle (User user ) ;

    List<User> getAll();
}
