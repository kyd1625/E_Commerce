package com.angdo.E_Commerce.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@ToString
@Alias("ProductDTO")
public class ProductDTO {
    private int product_no;
    private String product_nm;
    private String product_category;
    private int product_price;
    private String product_sts;
    private int product_inventory;
    private String product_details;

}
