package com.mok.springbootmall.rowmapper;

import com.mok.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {


    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
    Product product = new Product();

    product.setProductId(resultSet.getInt("product_id"));
    product.getProductName(resultSet.getString("name"));
    product.setCategory(resultSet.getString("Category"));
    product.setImageUrl(resultSet.getString("ImageUrl"));
    product.setPrice(resultSet.getInt("Price"));
    product.setStock(resultSet.getInt("Stock"));
    product.setDescription(resultSet.getString("Description"));
    product.setCreatedDate(resultSet.getTimestamp("CreatedDate"));
    product.setLastModifiedDate(resultSet.getTimestamp("LastModifiedDate"));

    return product;
    }
}
