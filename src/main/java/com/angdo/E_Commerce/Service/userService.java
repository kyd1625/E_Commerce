package com.angdo.E_Commerce.Service;

import com.angdo.E_Commerce.Repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userService {

    @Autowired
    private userRepository userRepository;

}
