package io.rssreader.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.rssreader.model.Subscription;
import io.rssreader.service.SubscriptionService;

@RestController
@RequestMapping(value="/feeds")
public class FeedsController {

    @Autowired
    private SubscriptionService subscriptionService;
    
    @RequestMapping(value="/subscribe", method = RequestMethod.POST)
    private ResponseEntity<Subscription> subscribe(@RequestBody Subscription subscription) {
        return new ResponseEntity<Subscription>(subscriptionService.subscribe(subscription), HttpStatus.CREATED);
    }
    
    @RequestMapping(value="/all", method = RequestMethod.GET)
    private ResponseEntity<Iterable<Subscription>> allSubscriptions() {
        return new ResponseEntity<Iterable<Subscription>>(subscriptionService.listAll(), HttpStatus.OK);
    }
}
