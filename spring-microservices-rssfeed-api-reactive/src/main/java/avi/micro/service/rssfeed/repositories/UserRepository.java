package avi.micro.service.rssfeed.repositories;

import org.springframework.data.repository.CrudRepository;

import avi.micro.service.rssfeed.model.User;

public interface UserRepository extends CrudRepository<User, String> {
    
    public User findByLastName(String lastName);
    public User findByEmail(String email);
}