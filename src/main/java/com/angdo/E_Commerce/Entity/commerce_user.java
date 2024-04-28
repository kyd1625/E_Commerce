package com.angdo.E_Commerce.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(UserId.class)
@Table(name="commerce_user")
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
