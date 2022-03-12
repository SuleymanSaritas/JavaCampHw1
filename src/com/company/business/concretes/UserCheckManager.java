package com.company.business.concretes;

import com.company.business.abstracts.UserCheckService;
import com.company.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {
    List<String> AllEmails = new ArrayList<String>();

    @Override
    public boolean checkUserFname(User user) {

        if (user.getFname().length() < 2) {
            System.out.println(" Ad 2 karakterden kısa olamaz");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkUserLname(User user) {

        if (user.getLname().length() < 2) {
            System.out.println(" Soyad 2 karakterden kısa olamaz");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkUserPassword(User user) {
        if (user.getPassword().length() < 6) {
            System.out.println(" Parola 6 karakterden kısa olamaz");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkUserEmail(User user) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        if (user.getEmail().isEmpty()) {
            System.out.println(" E-mail alani boş birakilamaz");
            return false;

        } else {
            if (pattern.matcher(user.getEmail()).find() == false) {
                System.out.println(" Girilen email adresi formata uygun değil . Örnek birisiexample@example.com ");
                return false;
            }
            return true;
        }

    }

    @Override
    public boolean checkUserEmailIsUsed(User user) {
        if (!AllEmails.contains(user.getEmail())) {
            AllEmails.add(user.getEmail());

            return true;

        } else {
            System.out.println(" Sistemde önceden kullanılmış email kullanılamaz");
            return false;
        }
    }

    @Override
    public boolean IsvalidUser(User user) {
        if (checkUserFname(user) && checkUserLname(user) && checkUserPassword(user) && checkUserEmail(user) ) {
            return true;
        } else {
            return false;

        }
    }


}

