package com.angdo.E_Commerce.Repository;

import com.angdo.E_Commerce.Entity.UserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.angdo.E_Commerce.Entity.commerce_user;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<commerce_user, UserId> {
    // ID로 회원 정보 조회 ( select * from commerce_user where user_id = ? )
    Optional<commerce_user> findByUserId(String UserId);
}
