package com.microservice.feingclient.client;

import com.microservice.feingclient.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(url="http://jsonplaceholder.typicode.com", name="user-service")
public interface UserRequestClient {

    @GetMapping("/users")
    public List<User> getUsers();

}
