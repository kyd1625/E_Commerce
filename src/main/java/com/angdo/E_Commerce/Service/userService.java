package com.angdo.E_Commerce.Service;

import com.angdo.E_Commerce.Dto.UserDTO;
import com.angdo.E_Commerce.Entity.commerce_user;
import com.angdo.E_Commerce.Repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public UserDTO login(UserDTO userDTO) {
        // ID 를 DB에서 조회하고 조회한 비밀번호가 일치하는지 확인
        Optional<commerce_user> byUserId = userRepository.findByUserId(userDTO.getUser_id());
        if (byUserId.isPresent()){
            // 가입된 회원일 때
            commerce_user commerce_user = byUserId.get();
            if (commerce_user.getUser_password().equals(userDTO.getUser_password())){
                // 비밀번호가 일치할 때
                // entity 객체를 dto 로 변환 후 리턴
                UserDTO dto = UserDTO.toUserDTO(commerce_user);
                return dto;
            } else {
                // 비밀번호가 틀릴때
                return null;
            }
        } else{
            // 회원이 아닌 Id
            return null;
        }
    }

}
