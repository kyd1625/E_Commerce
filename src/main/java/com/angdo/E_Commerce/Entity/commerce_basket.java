package com.angdo.E_Commerce.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="commerce_basket")
public class commerce_basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer basket_no;

    @NonNull
    private String user_id;

    @NonNull
    private String user_nm;

    @NonNull
    private Integer product_no;

    @NonNull
    private String product_nm;

    @NonNull
    private String product_category;

    @NonNull
    private Integer product_price;

    @NonNull
    private String product_sts;

}
