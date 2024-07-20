package com.angdo.E_Commerce.Service;
import com.angdo.E_Commerce.Dao.ProductDao;
import com.angdo.E_Commerce.Dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class productService {

    final ProductDao productDao;

    public ProductDTO getProductDetails(ProductDTO productDTO) {

        ProductDTO productInfo = productDao.getProductDetails(productDTO);

        return productInfo;
    }

}
