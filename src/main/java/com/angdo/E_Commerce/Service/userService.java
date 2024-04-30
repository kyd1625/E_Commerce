package com.angdo.E_Commerce.Service;

import com.angdo.E_Commerce.Dto.UserDTO;
import com.angdo.E_Commerce.Entity.commerce_user;
import com.angdo.E_Commerce.Repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userService {

    @Autowired
    private final userRepository userRepository;

    public void save(UserDTO userDTO) {
        // 1. dto -> entity 객체로 변환
        // 2. repository의 save 메소드 호출
        commerce_user userEntity = commerce_user.toUserEntity(userDTO);

        // repository의 save 메소드 호출 (entity 를 넘겨줘야함)
        userRepository.save(userEntity);
    }
}
