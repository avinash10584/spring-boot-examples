package io.readily.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.readily.model.User;
import io.readily.repositories.UserRepository;
import io.readily.service.AccountService;

@Service
public class UserAccountService implements AccountService {

    @Autowired
    private UserRepository userRepo;
    
    public User enroll(User user) {
        return userRepo.save(user);
    }

    public User updateProfile(User user) {
        return userRepo.save(user);
    }

    public User deActivate(String lastName) {
        User user = userRepo.findByLastName(lastName);
        user.setActive(false);
        return userRepo.save(user);
    }

    public String resetPasswordRequest(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    public void resetPassword(String token, String password) {
        // TODO Auto-generated method stub
        
    }
}
