package com.angdo.E_Commerce.Dao;

import com.angdo.E_Commerce.Dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ProductDao {
    ArrayList getAllCategory();

    ProductDTO getAllProduct(ProductDTO productDTO);

    ProductDTO getProductDetails(ProductDTO productDTO);
}
