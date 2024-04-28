package com.angdo.E_Commerce.Repository;
import com.angdo.E_Commerce.Entity.UserAddressId;
import com.angdo.E_Commerce.Entity.user_address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface addressRepository extends JpaRepository<user_address, UserAddressId> {
}
