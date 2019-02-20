package avi.micro.service.rssfeed.service;

import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.validation.annotation.Validated;

import avi.micro.service.rssfeed.model.Subscription;

@Validated
public interface SubscriptionService {

    Subscription subscribe(@Valid Subscription subscription);
    void unsubscribe(String feedURL, String email);
    
    Iterable<Subscription> listForUser(@Valid @Email(message = "{email.invalid}") String email);
    Iterable<Subscription> listAll();
}
