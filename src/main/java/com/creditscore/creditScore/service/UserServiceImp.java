package com.creditscore.creditScore.service;

import com.creditscore.creditScore.model.User;
import com.creditscore.creditScore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    List<User> users;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findOne(Long id) {
        User user = userRepository.findOne(id);
        if (user.score<500) {
            user.getResult();
            user.setResult("Red");
        }
        if (user.score>=500 && user.score<1000 && user.budget<5000){
            user.getResult();
            user.setResult("Onay");
            user.setLimit(10000);
        }
        if (user.score>=1000) {
            user.setResult("Onay");
            user.setLimit(4*user.budget);
        }
        return user;
    }
}
