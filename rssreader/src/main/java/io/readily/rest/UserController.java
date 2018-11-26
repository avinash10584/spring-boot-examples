package io.readily.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.readily.model.User;
import io.readily.service.AccountService;

@RestController
public class UserController {

    @Autowired
    private AccountService userService;
    
    @RequestMapping(path = "/enroll", method = RequestMethod.POST)
    public void enroll(@RequestBody User user) {
        userService.enroll(user);
    }
}
