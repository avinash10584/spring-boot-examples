package io.readily.service;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import io.readily.model.User;

@Validated
public interface AccountService {
    
    User enroll(@Valid User user);
    User updateProfile(@Valid User user);
    
    User deActivate(String userId);
    
    String resetPasswordRequest(String email);
    void resetPassword(String token, String password);
}
