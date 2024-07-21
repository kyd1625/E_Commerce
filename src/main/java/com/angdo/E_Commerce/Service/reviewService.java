package com.angdo.E_Commerce.Service;

import com.angdo.E_Commerce.Dto.ReviewDTO;
import lombok.RequiredArgsConstructor;
import com.angdo.E_Commerce.Dao.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.angdo.E_Commerce.Repository.reviewRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class reviewService {

    final ReviewDao reviewDao;


    /**
     *
     * 상품No로 상품별 리뷰 조회
     * parameter : productNo
     *
     */
    public List<ReviewDTO> getReviewByProductNo(int productNo){


        List<ReviewDTO> reviewList = reviewDao.getReviewByProductNo(productNo);

        for(ReviewDTO review : reviewList){
            System.out.println("해당 상품의 review : " + review.toString());
        }

        return reviewList;
    }

    /**
     *
     * 리뷰 insert
     * parameter : reviewDTO
     *
     */
    public void insertReview(ReviewDTO reviewDTO){

        System.out.println(reviewDTO.toString());

        reviewDao.insertReview(reviewDTO);

        System.out.println("insert 들어옴");


    }

    /**
     *
     * 리뷰 update
     * parameter : reviewDTO
     *
     */
    public void updateReview(ReviewDTO reviewDTO){
        
        System.out.println(reviewDTO.toString());
        
        reviewDao.updateReview(reviewDTO);
        
        System.out.println("update 들어옴");
    }
}
