package avi.micro.service.account.service;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import avi.micro.service.account.model.User;

@Validated
public interface AccountService {
    
    User enroll(@Valid User user);
    User updateProfile(@Valid User user);
    
    User deActivate(String lastName);
    
    String resetPasswordRequest(String email);
    void resetPassword(String token, String password);
    User getByEmail(String email);
}
