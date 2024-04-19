package com.angdo.E_Commerce.Service;
import com.angdo.E_Commerce.Repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {

    @Autowired
    private productRepository productRepository;


}
