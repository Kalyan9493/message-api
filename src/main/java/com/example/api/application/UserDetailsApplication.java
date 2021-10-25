package com.example.api.application;

import com.example.api.model.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface UserDetailsApplication {
    public UserDetails save(UserDetails userDetails);
    public UserDetails getUserByUsernameAndPassword(String username, String password);
}
