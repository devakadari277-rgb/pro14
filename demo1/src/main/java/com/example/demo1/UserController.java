package com.example.demo1;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    // GET method
    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    // POST method with validation
    @PostMapping
    public String addUser(@Valid @RequestBody User user) {
        users.add(user);
        return "User added successfully";
    }
}