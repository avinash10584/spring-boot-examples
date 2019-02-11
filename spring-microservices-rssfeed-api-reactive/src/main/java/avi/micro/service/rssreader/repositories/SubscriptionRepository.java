package avi.micro.service.rssreader.repositories;

import org.springframework.data.repository.CrudRepository;

import avi.micro.service.rssreader.model.Subscription;

public interface SubscriptionRepository extends CrudRepository<Subscription, String> {
    public Iterable<Subscription> findByUserEmail(String email);
    public Subscription findByUserEmailAndFeedURL(String email, String feedURL);
}