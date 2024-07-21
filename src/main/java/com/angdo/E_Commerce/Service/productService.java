package com.angdo.E_Commerce.Service;
import com.angdo.E_Commerce.Dao.ProductDao;
import com.angdo.E_Commerce.Dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class productService {

    final ProductDao productDao;


    /**
     *
     * 상품No로 상품상세조회
     * parameter : productNo
     *
     */
    public ProductDTO getProductDetails(int productNo) {

        ProductDTO productInfo = productDao.getProductDetails(productNo);
        
        System.out.println("선택된 상품 : " + productInfo.toString());

        return productInfo;
    }

}
