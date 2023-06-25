package com.mok.springbootmall.dao;

import com.mok.springbootmall.constant.ProductCategory;
import com.mok.springbootmall.dto.ProductRequest;
import com.mok.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
