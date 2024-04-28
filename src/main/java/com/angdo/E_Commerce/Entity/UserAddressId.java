package com.angdo.E_Commerce.Entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserAddressId implements Serializable {
    private String user_id;
    private String user_nm;
}
