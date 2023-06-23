package com.mok.springbootmall.service;

import com.mok.springbootmall.dto.ProductRequest;
import com.mok.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
