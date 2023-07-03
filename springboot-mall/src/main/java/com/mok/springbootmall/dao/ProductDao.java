package com.mok.springbootmall.dao;

import com.mok.springbootmall.dto.ProductQueryParams;
import com.mok.springbootmall.dto.ProductRequest;
import com.mok.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);

}
