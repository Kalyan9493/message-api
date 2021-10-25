package com.example.api.controller;

import com.example.api.applicationImpl.UserDetailsApplicationImpl;
import com.example.api.model.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/user")
public class UserController {

    private UserDetailsApplicationImpl userDetailsApplicationImpl;

    @PostMapping("/save")
    public UserDetails save(@RequestBody UserDetails userDetails){
        return userDetailsApplicationImpl.save(userDetails);
    }
}
