package avi.micro.service.rssreader.repositories;

import org.springframework.data.repository.CrudRepository;

import avi.micro.service.rssreader.model.User;

public interface UserRepository extends CrudRepository<User, String> {
    
    public User findByLastName(String lastName);
    public User findByEmail(String email);
}