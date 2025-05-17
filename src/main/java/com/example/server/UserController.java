package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService = new UserService();

    @GetMapping
    public List<String> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
    }
}
