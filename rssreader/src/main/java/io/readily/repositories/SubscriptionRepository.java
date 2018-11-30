package io.readily.repositories;

import org.springframework.data.repository.CrudRepository;

import io.readily.model.Subscription;

public interface SubscriptionRepository extends CrudRepository<Subscription, String> {
    public Iterable<Subscription> findByUserEmail(String email);
}