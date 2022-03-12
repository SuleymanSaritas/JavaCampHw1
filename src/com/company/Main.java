package com.company;

import com.company.business.abstracts.UserService;
import com.company.business.concretes.EmailVerificationManager;
import com.company.business.concretes.UserCheckManager;
import com.company.business.concretes.UserManager;
import com.company.core.concretes.LoginServiceAdapter;
import com.company.dataAccess.concretes.HibernateUserDao;
import com.company.entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        UserService UserService = new UserManager(new HibernateUserDao(),new UserCheckManager(), new  EmailVerificationManager(),new LoginServiceAdapter());
        UserService UserService2 = new UserManager(new HibernateUserDao(),new UserCheckManager(), new  EmailVerificationManager(),new LoginServiceAdapter());
        User user = new User(1,"suleyman","saritas","suleymansaritas003@gmail.com","1803046");
        User user2 = new User(2,"suleyman","saritas",",suleymansaritas003@gmail.com","1803046");
        //UserService.addUser(user);
        //UserService.Login(user);
        //UserService2.addUser(user2);
        UserService2.SignupWithGoogle(user);
        UserService2.Login(user);
    }
}