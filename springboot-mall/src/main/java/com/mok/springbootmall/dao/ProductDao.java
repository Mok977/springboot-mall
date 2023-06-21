package com.mok.springbootmall.dao;

import com.mok.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
