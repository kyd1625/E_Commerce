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
@IdClass(PaymentId.class)
@Table(name="commerce_payment")
public class commerce_payment {

    @Id   // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mariaDB, MYSQL에서 사용하는 자동생성(auto increment)
    private Integer payment_no;

    private String user_id;

    @Id
    private String user_nm;

    private String user_password;

    private Integer phone_no;

    private String user_email;

    private Date user_create_dt;

}
