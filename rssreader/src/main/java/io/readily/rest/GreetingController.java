package io.readily.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${name}")
    private String name;
    
    @Value("${message}")
    private String message;
    
    @RequestMapping("/greeting")
    public String greeting() {
        return message + ", " + name;
    }
}
