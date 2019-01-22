package avi.micro.service.test.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import avi.micro.service.test.user.model.User;
import avi.micro.service.test.user.service.AccountService;

@Service
public class UserAccountService implements AccountService {

    private List<User> users = new ArrayList<>();
    
    public User enroll(User user) {
        users.add(user);
        return user;
    }

    public User updateProfile(User user) {
        users.remove(getByEmail(user.getEmail()));
        users.add(user);
        return user;
    }

    public User deActivate(String email) {
        User user = getByEmail(email);
        user.setActive(false);
        return user;
    }

    public String resetPasswordRequest(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    public void resetPassword(String token, String password) {
        // TODO Auto-generated method stub        
    }

    public User getByEmail(String email) {
        return users.stream().filter(x -> x.getEmail().equals(email)).findFirst().get();
    }
}
