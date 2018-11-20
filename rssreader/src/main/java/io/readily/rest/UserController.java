package io.readily.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${name}")
    private String name;
    
    @Value("${message}")
    private String message;
    
    @RequestMapping(path = "/enroll", method = RequestMethod.POST)
    public String enroll() {
        return message + ", " + name;
    }
}
