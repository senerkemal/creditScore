package com.creditscore.creditScore.controller;

import com.creditscore.creditScore.model.User;
import com.creditscore.creditScore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/dashboard/{id}")
    public User getUsers(@PathVariable Long id) {
        User users = userService.findOne(id);
        return users;
    }

    @PostMapping(value = "/")
    public User loginPage(@RequestBody User user) {
        return user;
    }
}
