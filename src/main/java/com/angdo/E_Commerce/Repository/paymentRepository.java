package com.angdo.E_Commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.angdo.E_Commerce.Entity.commerce_payment;
import org.springframework.stereotype.Repository;

@Repository
public interface paymentRepository extends JpaRepository<commerce_payment, Integer> {

}
