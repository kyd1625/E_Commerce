package com.angdo.E_Commerce.Dao;


import com.angdo.E_Commerce.Dto.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewDao {

    ReviewDTO getReviewByProductNo(int productNo);

    void insertReview(ReviewDTO reviewDTO);
}
