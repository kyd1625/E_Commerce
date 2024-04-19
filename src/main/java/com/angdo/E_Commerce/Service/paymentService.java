package com.angdo.E_Commerce.Service;
import com.angdo.E_Commerce.Repository.paymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentService {

    @Autowired
    private paymentRepository paymentRepository;


}
