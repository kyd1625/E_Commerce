package com.angdo.E_Commerce.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@AllArgsConstructor
public class commerce_product {

    @Id   // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mariaDB, MYSQL에서 사용하는 자동생성(auto increment)
    private Integer product_no;

    @Id
    private String product_nm;

    @Id
    private String product_category;

    @Id
    private Integer product_price;

    @Id
    private String product_sts;
    
    private Integer product_inventory;

    @Column(columnDefinition = "TEXT") // mysql text 타입설정
    private String product_details;


}
