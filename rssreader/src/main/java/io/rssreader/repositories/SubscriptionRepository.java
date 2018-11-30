package io.rssreader.repositories;

import org.springframework.data.repository.CrudRepository;

import io.rssreader.model.Subscription;

public interface SubscriptionRepository extends CrudRepository<Subscription, String> {
    public Iterable<Subscription> findByUserEmail(String email);
}