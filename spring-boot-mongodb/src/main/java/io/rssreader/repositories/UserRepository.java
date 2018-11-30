package io.rssreader.repositories;

import org.springframework.data.repository.CrudRepository;

import io.rssreader.model.User;

public interface UserRepository extends CrudRepository<User, String> {
    
    public User findByLastName(String lastName);
    public User findByEmail(String email);
}