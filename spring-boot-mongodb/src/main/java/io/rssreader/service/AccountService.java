package io.rssreader.service;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import io.rssreader.model.User;

@Validated
public interface AccountService {
    
    User enroll(@Valid User user);
    User updateProfile(@Valid User user);
    
    User deActivate(String lastName);
    
    String resetPasswordRequest(String email);
    void resetPassword(String token, String password);
    User getByEmail(String email);
}
