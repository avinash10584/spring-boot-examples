package avi.micro.service.rssfeed.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import avi.micro.service.rssfeed.model.Subscription;
import avi.micro.service.rssfeed.repositories.SubscriptionRepository;
import avi.micro.service.rssfeed.service.SubscriptionService;

@Service
public class FeedSubscriptionService implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepo;
    
    public Subscription subscribe(Subscription subscription) {
        return subscriptionRepo.save(subscription);
    }

    public void unsubscribe(String feedURL, String email) {
        subscriptionRepo.delete(subscriptionRepo.findByUserEmailAndFeedURL(email, feedURL));        
    }

    public Iterable<Subscription> listForUser(String email) {
        return subscriptionRepo.findByUserEmail(email);      
    }

    public Iterable<Subscription> listAll() {
        return subscriptionRepo.findAll();
    }
}
