package com.creditscore.creditScore.service;

import com.creditscore.creditScore.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    User findOne(Long id);
}
