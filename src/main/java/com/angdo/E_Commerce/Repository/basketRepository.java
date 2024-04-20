package com.angdo.E_Commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.angdo.E_Commerce.Entity.commerce_basket;

@Repository
public interface basketRepository extends JpaRepository<commerce_basket, Integer> {
}
