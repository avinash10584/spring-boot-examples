package io.readily.repositories;

import org.springframework.data.repository.CrudRepository;

import io.readily.model.User;

public interface UserRepository extends CrudRepository<User, String> {
    
    public User findByLastName(String lastName);
}