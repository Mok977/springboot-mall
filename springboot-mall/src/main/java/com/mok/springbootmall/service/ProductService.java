package com.mok.springbootmall.service;

import com.mok.springbootmall.constant.ProductCategory;
import com.mok.springbootmall.dto.ProductRequest;
import com.mok.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
