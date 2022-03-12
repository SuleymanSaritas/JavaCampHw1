package com.company.core.concretes;

import com.company.GoogleManager;
import com.company.core.abstracts.LoginService;

public class LoginServiceAdapter implements LoginService {

    @Override
    public void login(String email) {
        GoogleManager googleManager = new GoogleManager();
        googleManager.loginWithGoogle(email);
    }
}
