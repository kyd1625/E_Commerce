package com.angdo.E_Commerce.Entity;

import com.angdo.E_Commerce.Dto.UserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(UserId.class)
@Table(name="commerce_user")
public class commerce_user {

    @Id   // PK
    @Column(name="user_id")
    private String userId;

    @Id
    private String user_nm;

    private String user_password;

    private Integer phone_no;

    private String user_email;

    private Date user_create_dt;

    public static commerce_user toUserEntity(UserDTO userDTO){
        commerce_user commerce_user = new commerce_user();
        commerce_user.setUserId(userDTO.getUser_id());
        commerce_user.setUser_password(userDTO.getUser_password());
        commerce_user.setUser_nm(userDTO.getUser_nm());
        commerce_user.setUser_email(userDTO.getUser_email());

        LocalDateTime now = LocalDateTime.now();
        Date date = java.sql.Timestamp.valueOf(now);
        commerce_user.setUser_create_dt(date);
        return commerce_user;
    }
}
