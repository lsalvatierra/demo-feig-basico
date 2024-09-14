package com.la.demo_feign_basico.service;

import com.la.demo_feign_basico.clientrest.placeholder.UserClient;
import com.la.demo_feign_basico.clientrest.placeholder.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {


    private final UserClient userClient;

    public User getUserById(Long id) {
        return userClient.getUserById(id);
    }

    public User createUser(User user) {
        return userClient.createUser(user);
    }
}
