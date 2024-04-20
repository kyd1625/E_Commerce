package com.angdo.E_Commerce.Service;

import com.angdo.E_Commerce.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

    @Autowired
    private userRepository userRepository;


}
