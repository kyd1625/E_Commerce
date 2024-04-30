package com.angdo.E_Commerce.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

}
