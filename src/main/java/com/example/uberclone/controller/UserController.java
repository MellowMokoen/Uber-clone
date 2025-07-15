package com.example.uberclone.controller;

import com.example.uberclone.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        return null;
    }
}
