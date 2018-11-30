package io.readily.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.readily.model.User;
import io.readily.service.AccountService;

@RestController("/user")
public class UserController {

    @Autowired
    private AccountService userService;
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> enroll(@RequestBody User user) {
        userService.enroll(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED); 
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<User> update(@RequestBody User user) {
        userService.enroll(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED); 
    }
}
