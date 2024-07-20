package com.angdo.E_Commerce.Service;

import com.angdo.E_Commerce.Dto.ReviewDTO;
import lombok.RequiredArgsConstructor;
import com.angdo.E_Commerce.Dao.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.angdo.E_Commerce.Repository.reviewRepository;

@Service
@RequiredArgsConstructor
public class reviewService {

    private ReviewDao reviewDao;

    public ReviewDTO getReviewByProductNo(int productNo){

        ReviewDTO reviewInfo = reviewDao.getReviewByProductNo(productNo);

        return reviewInfo;
    }
}
