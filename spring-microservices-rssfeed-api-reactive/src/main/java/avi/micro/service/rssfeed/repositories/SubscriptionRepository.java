package avi.micro.service.rssfeed.repositories;

import org.springframework.data.repository.CrudRepository;

import avi.micro.service.rssfeed.model.Subscription;

public interface SubscriptionRepository extends CrudRepository<Subscription, String> {
    public Iterable<Subscription> findByUserEmail(String email);
    public Subscription findByUserEmailAndFeedURL(String email, String feedURL);
}