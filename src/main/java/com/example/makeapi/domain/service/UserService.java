package com.example.makeapi.domain.service;

import com.example.makeapi.domain.model.User;
import com.example.makeapi.port.adapter.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    private UserService(UserRepository repository){
        this.repository = repository;
    }

    private User registerUser(User user){
        return repository.save(user);
    }


}
