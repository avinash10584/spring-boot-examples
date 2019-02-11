package avi.micro.service.rssreader.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import avi.micro.service.rssreader.model.Subscription;
import avi.micro.service.rssreader.model.User;
import avi.micro.service.rssreader.service.AccountService;
import avi.micro.service.rssreader.service.SubscriptionService;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private AccountService userService;
    
    @Autowired
    private SubscriptionService subscriptionService;
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> enroll(@RequestBody User user) {
        userService.enroll(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED); 
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<User> update(@RequestBody User user) {
        userService.updateProfile(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED); 
    }
    
    @RequestMapping(value="/{email}", method = RequestMethod.GET)
    public ResponseEntity<User> get(@PathVariable(name="email") final String email) {        
        return new ResponseEntity<User>(userService.getByEmail(email), HttpStatus.OK); 
    }
    
    @RequestMapping(value="/{email}/feeds", method = RequestMethod.GET)
    private ResponseEntity<Iterable<Subscription>> userSubscriptions(@PathVariable(name="email") final String email) {
        return new ResponseEntity<Iterable<Subscription>>(subscriptionService.listForUser(email),
                HttpStatus.OK);
    }
}
