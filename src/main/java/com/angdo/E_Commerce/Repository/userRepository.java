package com.angdo.E_Commerce.Repository;

import com.angdo.E_Commerce.Entity.UserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.angdo.E_Commerce.Entity.commerce_user;
@Repository
public interface userRepository extends JpaRepository<commerce_user, UserId> {
    // JPA를 상속받아 사용 <엔티티 , 엔티티 내 pk 타입>
}
