package com.microservice.feingclient.controller;


import com.microservice.feingclient.client.UserRequestClient;
import com.microservice.feingclient.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRequestClient userClient;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userClient.getUsers();
    }

}
