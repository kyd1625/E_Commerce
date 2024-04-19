package com.angdo.E_Commerce.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
public class product_review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer review_no;

    @NonNull
    private Integer product_no;

    @NonNull
    private String product_nm;

    @NonNull
    private String product_category;

    @NonNull
    private String user_id;

    @NonNull
    private String user_nm;

    @NonNull
    private Integer product_price;

    @NonNull
    private String product_sts;

    private Integer review_score;

    @Column(columnDefinition = "TEXT")
    private String review_text;

}
