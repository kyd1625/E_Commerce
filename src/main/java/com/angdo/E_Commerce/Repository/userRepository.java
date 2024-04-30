package com.angdo.E_Commerce.Repository;

import com.angdo.E_Commerce.Entity.UserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.angdo.E_Commerce.Entity.commerce_user;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<commerce_user, UserId> {

}
