package com.angdo.E_Commerce.Service;
import com.angdo.E_Commerce.Dao.ProductDao;
import com.angdo.E_Commerce.Dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class productService {

    final ProductDao productDao;

    public ProductDTO getProductDetails(int productNo) {

        ProductDTO productInfo = productDao.getProductDetails(productNo);
        
        System.out.println("상품 디테일 들어옴");

        return productInfo;
    }

}
