package io.readily.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.readily.model.Subscription;
import io.readily.repositories.SubscriptionRepository;
import io.readily.service.SubscriptionService;

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
