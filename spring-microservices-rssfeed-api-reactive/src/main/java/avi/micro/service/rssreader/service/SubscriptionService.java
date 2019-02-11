package avi.micro.service.rssreader.service;

import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.validation.annotation.Validated;

import avi.micro.service.rssreader.model.Subscription;

@Validated
public interface SubscriptionService {

    Subscription subscribe(@Valid Subscription subscription);
    void unsubscribe(String feedURL, String email);
    
    Iterable<Subscription> listForUser(@Valid @Email(message = "{email.invalid}") String email);
    Iterable<Subscription> listAll();
}
