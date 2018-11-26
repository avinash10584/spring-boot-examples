package io.readily.service;

import io.readily.model.User;

public interface AccountService {
    void enroll(User user);
    void resetPassword(String email);    
}
