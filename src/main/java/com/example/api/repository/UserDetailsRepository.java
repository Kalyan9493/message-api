package com.example.api.repository;

import com.example.api.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
    @Override
    public UserDetails save(UserDetails entity);

    @Query(value = "select ud from UserDetails ud where ud.name = :username and ud.password = :password")
    public UserDetails getUserDetailsByUsernameAndPassword(String username, String password);
}
