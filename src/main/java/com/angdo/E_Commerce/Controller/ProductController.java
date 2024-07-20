package com.angdo.E_Commerce.Controller;

import com.angdo.E_Commerce.Dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import com.angdo.E_Commerce.Service.productService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final productService productService;

    @PostMapping("/product/productDetail")
    public String getProductDetails(@RequestBody ProductDTO productDTO){

        System.out.println(productDTO.toString());

        productService.getProductDetails(productDTO.getProduct_no());

        return "index";
    }
}
