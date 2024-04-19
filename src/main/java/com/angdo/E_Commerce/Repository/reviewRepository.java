package com.angdo.E_Commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.angdo.E_Commerce.Entity.product_review;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewRepository extends JpaRepository <product_review, Integer>{
}
