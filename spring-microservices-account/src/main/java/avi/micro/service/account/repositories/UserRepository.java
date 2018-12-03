package avi.micro.service.account.repositories;

import org.springframework.data.repository.CrudRepository;

import avi.micro.service.account.model.User;

public interface UserRepository extends CrudRepository<User, String> {
    
    public User findByLastName(String lastName);
    public User findByEmail(String email);
}