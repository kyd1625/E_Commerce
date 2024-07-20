package com.angdo.E_Commerce.Dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@ToString
@Alias("ReviewDTO")
public class ReviewDTO {
    private int review_no;
    private int product_no;
    private String product_nm;
    private String product_category;
    private String user_id;
    private String user_nm;
    private int product_price;
    private String product_sts;
    private int review_score;
    private String review_text;
}
