package com.angdo.E_Commerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
public class commerce_wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer list_no;

    @NonNull
    private String user_id;

    @NonNull
    private String user_nm;

    @NonNull
    private String product_no;

    @NonNull
    private String product_nm;

    @NonNull
    private String product_category;

    @NonNull
    private Integer product_price;

    @NonNull
    private String product_sts;

}
