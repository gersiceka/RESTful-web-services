package com.lhind.RESTfulwebservices.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public interface UserDetailsService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    UserDetails save(UserDetails u);
    Optional<UserDetails> findById(Integer id);
}
