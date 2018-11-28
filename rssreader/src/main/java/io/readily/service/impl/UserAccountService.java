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
    
    public void enroll(User user) {
        userRepo.save(user);
    }

    public void resetPassword(String email) {
        // TODO Auto-generated method stub
        
    }
}
