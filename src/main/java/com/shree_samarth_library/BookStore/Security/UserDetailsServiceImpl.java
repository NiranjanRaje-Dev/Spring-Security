package com.shree_samarth_library.BookStore.Security;

import com.shree_samarth_library.BookStore.Entity.User;
import com.shree_samarth_library.BookStore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {

        var u = userRepository.findUserByUsername(username);

        System.out.println(username);

        if(u.isEmpty()){
            System.out.println("Username not found as existing user is null");
            return null;
        }

        CustomUserDetails userDetails = new CustomUserDetails();
        userDetails.setUser(u.get());

        //System.out.println(userDetails.getUsername() + " ******** " + userDetails.getPassword() );
        return  userDetails;




    }


}
