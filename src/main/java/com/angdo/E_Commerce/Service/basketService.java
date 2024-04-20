package com.angdo.E_Commerce.Service;
import com.angdo.E_Commerce.Repository.basketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class basketService {

    @Autowired
    private basketRepository basketRepository;

}
