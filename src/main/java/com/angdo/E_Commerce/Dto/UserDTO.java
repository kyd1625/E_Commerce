package com.angdo.E_Commerce.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import com.angdo.E_Commerce.Entity.commerce_user;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDTO {
    private String user_id;
    private String user_nm;
    private String user_password;
    private String user_email;
    private String phone_no;

     public static UserDTO toUserDTO (commerce_user commerce_user){
         UserDTO userDTO = new UserDTO();
         userDTO.setUser_id(commerce_user.getUserId());
         userDTO.setUser_email(commerce_user.getUser_email());
         userDTO.setUser_password(commerce_user.getUser_password());
         userDTO.setUser_nm(commerce_user.getUser_nm());
         return userDTO;
     }

}
