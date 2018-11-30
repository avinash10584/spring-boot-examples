package io.rssreader.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.rssreader.model.Subscription;
import io.rssreader.repositories.SubscriptionRepository;
import io.rssreader.service.SubscriptionService;

@Service
public class FeedSubscriptionService implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepo;
    
    public Subscription subscribe(Subscription subscription) {
        return subscriptionRepo.save(subscription);
    }

    public void unsubscribe(String feedURL, String email) {
        // TODO Auto-generated method stub        
    }

    public Iterable<Subscription> listForUser(String email) {
        return subscriptionRepo.findByUserEmail(email);      
    }

    public Iterable<Subscription> listAll() {
        return subscriptionRepo.findAll();
    }
}
