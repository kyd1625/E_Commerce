package com.angdo.E_Commerce.Entity;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(UserAddressId.class)
@Table(name="user_address")
public class user_address {

    @Id
    private String user_id;

    @Id
    private String user_nm;

    private Integer address_no;

    private String address_type;

    private String address;



}
