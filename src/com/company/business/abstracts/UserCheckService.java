package com.company.business.abstracts;

import com.company.entities.concretes.User;

public interface UserCheckService {
    boolean checkUserFname(User user) ;
    boolean checkUserLname(User user) ;
    boolean checkUserPassword(User user) ;
    boolean checkUserEmail(User user) ;
    boolean checkUserEmailIsUsed(User user);
    boolean IsvalidUser (User user) ;

}
