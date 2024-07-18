package com.angdo.E_Commerce.Dto;

import lombok.*;
import com.angdo.E_Commerce.Entity.commerce_user;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@ToString
@Alias("UserDTO")
public class UserDTO {
    private String user_id;
    private String user_nm;
    private String user_password;
    private String user_email;
    private String phone_no;


}
