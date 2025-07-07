package com.tien.ss01.repo;

import com.tien.ss01.entity.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();
    boolean save(Product product);
    boolean update(Product product);
    boolean delete(Product product);
}
