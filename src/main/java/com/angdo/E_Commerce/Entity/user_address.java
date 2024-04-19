package com.angdo.E_Commerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class user_address {

    @Id
    private String user_id;

    @Id
    private String user_nm;

    private Integer address_no;

    private String address_type;

    private String address;
}
