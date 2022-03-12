package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println(" Hibernate ile kullancı eklendi");

    }

    @Override
    public void updateUser(User user) {
        System.out.println(" Hibernate ile kullancı güncellendi");
    }

    @Override
    public void deleteUser(User user) {
        System.out.println(" Hibernate ile kullancı silindi");
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
