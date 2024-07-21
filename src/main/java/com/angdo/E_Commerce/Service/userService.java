package com.angdo.E_Commerce.Service;

import com.angdo.E_Commerce.Dto.UserDTO;
import com.angdo.E_Commerce.Repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.angdo.E_Commerce.Dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class userService {

    @Autowired
    private final userRepository userRepository;

    final UserDao userDao;

    @Transactional(rollbackFor = Exception.class) // 회원가입 insert 시 에러가 발생했을때 롤백 (Exception.class에 해당하는 오류일시 롤백)
    public void save(UserDTO userDTO) {
        // 가입된 회원인지 먼저 체크
        UserDTO userInfo = userDao.getUserById(userDTO);
        if(userInfo != null){
            throw new RuntimeException("이미 가입된 회원입니다."); // 가입된 유저일 때 RuntimeException 발생시킴
        } else {
            userDao.insUser(userDTO);
            // 회원가입 완료
            System.out.println("회원가입완료");
        }
    }

    public UserDTO login(UserDTO userDTO) {

        // ID 를 DB에서 조회하고 조회한 비밀번호가 일치하는지 확인
        UserDTO userInfo = userDao.getUserById(userDTO);

        if (userInfo != null){
            // 가입된 회원일 때
            UserDTO commerce_user = userInfo;
            if (commerce_user.getUser_password().equals(userDTO.getUser_password())){
                // 비밀번호가 일치할 때 dto 정보 리턴
                return commerce_user;
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
