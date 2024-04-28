package com.angdo.E_Commerce.Entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProductId implements Serializable {
    private Integer product_no;
    private String product_nm;
    private String product_category;
    private Integer product_price;
    private String product_sts;
}
