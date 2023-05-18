package com.lhind.RESTfulwebservices.repository;

import com.lhind.RESTfulwebservices.model.enums.UserDetails;

import java.util.Optional;

public interface UserDetailsRepository {
    void save(UserDetails userDetails);

    Optional<org.springframework.security.core.userdetails.UserDetails> findById(Integer id);

    org.springframework.security.core.userdetails.UserDetails save(org.springframework.security.core.userdetails.UserDetails u);
}
