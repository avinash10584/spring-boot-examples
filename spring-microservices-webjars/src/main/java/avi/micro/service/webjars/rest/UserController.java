package avi.micro.service.webjars.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {
    
    @RequestMapping(value="/{email}", method = RequestMethod.GET)
    public ResponseEntity<String> get(@PathVariable(name="email") final String email) {        
        return new ResponseEntity<String>(email, HttpStatus.OK); 
    }
}
