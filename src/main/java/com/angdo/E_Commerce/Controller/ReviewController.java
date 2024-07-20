package com.angdo.E_Commerce.Controller;

import com.angdo.E_Commerce.Dto.ReviewDTO;
import com.angdo.E_Commerce.Service.reviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ReviewController {

    private final reviewService reviewService;

    public String getReviewByProductNo(int productNo){
        reviewService.getReviewByProductNo(productNo);
        
        return "프론트 작업시 변경";
    }
}
