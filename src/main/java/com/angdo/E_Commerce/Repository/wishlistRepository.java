package com.angdo.E_Commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.angdo.E_Commerce.Entity.commerce_wishlist;
import org.springframework.stereotype.Repository;

@Repository
public interface wishlistRepository extends JpaRepository<commerce_wishlist, Integer> {
}
