package com.la.demo_feign_basico.clientrest.placeholder;

import com.la.demo_feign_basico.clientrest.placeholder.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "userClient", url = "https://jsonplaceholder.typicode.com")
public interface UserClient {

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id);

    @PostMapping("/users")
    User createUser(@RequestBody User user);
}
