package com.angdo.E_Commerce.Controller;

import com.angdo.E_Commerce.Dto.ProductDTO;
import com.angdo.E_Commerce.Dto.ReviewDTO;
import com.angdo.E_Commerce.Service.reviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class ReviewController {

    private final reviewService reviewService;

    @PostMapping("/review/test")
    public String getReviewByProductNo(@RequestBody int productNo){

        // 상품별 review 조회
        reviewService.getReviewByProductNo(productNo);
        
        return "index";
    }

    @PostMapping("/review/insert")
    public String insertReview(@RequestBody ReviewDTO reviewDTO){

        // 리뷰 insert
        reviewService.insertReview(reviewDTO);

        return "index";
    }

    @PostMapping("/reivew/update")
    public String updateReview(@RequestBody ReviewDTO reviewDTO){
        
        // 리뷰 업데이트
        reviewService.updateReview(reviewDTO);

        return "index";
    }
}
