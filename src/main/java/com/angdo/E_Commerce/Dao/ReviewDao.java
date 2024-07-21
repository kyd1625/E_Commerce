package com.angdo.E_Commerce.Dao;


import com.angdo.E_Commerce.Dto.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewDao {

    List<ReviewDTO> getReviewByProductNo(int productNo);

    void insertReview(ReviewDTO reviewDTO);

    void updateReview(ReviewDTO reviewDTO);
}
