package com.angdo.E_Commerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.angdo.E_Commerce.Repository.addressRepository;
import com.angdo.E_Commerce.Entity.user_address;

@Service
public class addressService {

    @Autowired
    private addressRepository addressRepository;

    /*
    public void create(user_address user_address){
        addressRepository.save(user_address);
    }
    */
}
