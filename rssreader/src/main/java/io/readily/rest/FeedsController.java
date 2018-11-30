package io.readily.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.readily.model.Subscription;
import io.readily.service.SubscriptionService;

@RestController
@RequestMapping(value="/feeds")
public class FeedsController {

    @Autowired
    private SubscriptionService subscriptionService;
    
    @RequestMapping(value="/subscribe", method = RequestMethod.POST)
    private Subscription subscribe(@RequestBody Subscription subscription) {
        return subscriptionService.subscribe(subscription);
    }
    
    @RequestMapping(value="/all", method = RequestMethod.GET)
    private Iterable<Subscription> allSubscriptions() {
        return subscriptionService.listAll();
    }
    
    @RequestMapping(value="/user/{email}", method = RequestMethod.GET)
    private Iterable<Subscription> userSubscriptions(@PathVariable(name="email") final String email) {
        return subscriptionService.listForUser(email);
    }
}
