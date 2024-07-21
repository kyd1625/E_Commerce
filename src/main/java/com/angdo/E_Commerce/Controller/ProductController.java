package com.angdo.E_Commerce.Controller;

import com.angdo.E_Commerce.Dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import com.angdo.E_Commerce.Service.productService;
import com.angdo.E_Commerce.Service.reviewService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final productService productService;
    private final reviewService reviewService;

    @PostMapping("/product/productDetail")
    public String getProductDetails(@RequestBody int product_no){

        // 상품 상세 조회
        productService.getProductDetails(product_no);

        // 상품에 대한 리뷰 조회
        reviewService.getReviewByProductNo(product_no);

        return "index";
    }
}
