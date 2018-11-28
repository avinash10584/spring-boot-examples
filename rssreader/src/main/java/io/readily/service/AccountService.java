package io.readily.service;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import io.readily.model.User;

@Validated
public interface AccountService {
    void enroll(@Valid User user);
    void resetPassword(String email);    
}
