package com.angdo.E_Commerce.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
public class commerce_user {

    @Id   // PK
    private String user_id;

    @Id
    private String user_nm;

    private String user_password;

    private Integer phone_no;

    private String user_email;

    private Date user_create_dt;

}
