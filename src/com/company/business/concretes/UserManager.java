package com.company.business.concretes;

import com.company.business.abstracts.UserCheckService;
import com.company.business.abstracts.UserService;
import com.company.business.abstracts.VerificationService;
import com.company.core.abstracts.LoginService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;
    private UserCheckService userCheckService;
    private VerificationService verificationService;
    private LoginService loginService ;

    public UserManager(UserDao userDao, UserCheckService userCheckService, VerificationService verificationService,LoginService loginService) {
        this.userDao = userDao;
        this.userCheckService = userCheckService;
        this.verificationService = verificationService;
        this.loginService = loginService ;

    }



    @Override
    public void addUser(User user) {
        if (this.userCheckService.IsvalidUser(user)&&this.userCheckService.checkUserEmailIsUsed(user)) {
            this.verificationService.sendVerificationMail(user.getEmail());
            this.verificationService.verifyEmail(user.getEmail());
            this.userDao.addUser(user);
        } else {
            System.out.println(" Girilen bilgiler hatalı");
        }


    }

    @Override
    public void Login(User user) {
        if (this.userCheckService.IsvalidUser(user) && this.verificationService.isVerifiedAccount(user.getEmail())) {
            System.out.println(" Giriş Sağlandı ");
        } else {
            System.out.println(" Kullanıcı bilgileri hatalı veya sistemde kayıtlı böyle bir kullanıcı bulunamıyor");
        }
    }

    @Override
    public void SignupWithGoogle(User user) {
        if (this.userCheckService.IsvalidUser(user)){
            this.loginService.login(user.getEmail());
            this.verificationService.verifyEmail(user.getEmail());
            this.userDao.addUser(user);
        }else {
            System.out.println(" Girilen bilgiler hatalı");
        }
    }



    @Override
    public List<User> getAll() {
        return null;
    }
}
