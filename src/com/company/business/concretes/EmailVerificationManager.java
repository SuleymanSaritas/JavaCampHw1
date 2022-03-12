package com.company.business.concretes;

import com.company.business.abstracts.VerificationService;

import java.util.ArrayList;
import java.util.List;

public class EmailVerificationManager implements VerificationService {
    List<String> verificatedEmails = new ArrayList<String>();
    @Override
    public void sendVerificationMail(String email) {
        System.out.println(" Verification mail başarılı bir şekilde gönderildi");
    }

    @Override
    public void verifyEmail(String email) {
        System.out.println(" Doğrulama başarılı bir şekilde gerçekleşti");
        verificatedEmails.add(email);
    }

    @Override
    public boolean isVerifiedAccount(String email) {
        if(verificatedEmails.contains(email)){
            return true;
        }else
            return false;
    }
}
