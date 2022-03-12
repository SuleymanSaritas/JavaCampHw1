package com.company.business.abstracts;

public interface VerificationService {
    void sendVerificationMail( String email);
    void verifyEmail( String email);
    boolean isVerifiedAccount(String email);
}
