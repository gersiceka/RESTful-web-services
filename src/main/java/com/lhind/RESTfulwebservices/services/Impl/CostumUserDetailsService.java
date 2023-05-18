package com.lhind.RESTfulwebservices.services.Impl;

import com.lhind.RESTfulwebservices.model.enums.RoleEnum;
import com.lhind.RESTfulwebservices.model.enums.User;
import com.lhind.RESTfulwebservices.repository.UserRepository;
import com.lhind.RESTfulwebservices.services.UserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CostumUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(this::toUserDetails)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    }

    /**
     * @param u
     * @return
     */
    @Override
    public UserDetails save(UserDetails u) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<UserDetails> findById(Integer id) {
        return Optional.empty();
    }

    private UserDetails toUserDetails(User user) {
        return User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .role((RoleEnum) user.getRole().name())
                .build();
    }

}
