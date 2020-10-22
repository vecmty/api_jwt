package com.vecmty.firstProject.service;


import com.vecmty.firstProject.model.MyUserDetails;
import com.vecmty.firstProject.model.User;
import com.vecmty.firstProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username) ;
        user.orElseThrow(() -> new UsernameNotFoundException("Not found:" + username));
        return user.map(MyUserDetails::new).get();
    }
}
