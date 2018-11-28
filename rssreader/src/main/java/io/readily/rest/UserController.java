package io.readily.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<User> enroll(@Valid @RequestBody User user) {
        userService.enroll(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED); 
    }
}
