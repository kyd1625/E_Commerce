package com.angdo.E_Commerce.Controller;

import com.angdo.E_Commerce.Dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import com.angdo.E_Commerce.Service.productService;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final productService productService;

    public String getProductDetails(ProductDTO productDTO){

        productService.getProductDetails(productDTO);

        return "프론트 작업에 url 넣어주기 상세설명";
    }
}
