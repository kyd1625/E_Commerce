package com.angdo.E_Commerce.Dao;

import com.angdo.E_Commerce.Dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    UserDTO getUserById(UserDTO userDTO);

    void insUser(UserDTO userDTO);

}
