package com.igor.products_api.service;

import com.igor.products_api.dto.CreateProductRequest;
import com.igor.products_api.dto.ProductResponse;
import com.igor.products_api.dto.UpdateProductRequest;

import java.util.List;

public interface ProductService {

    ProductResponse create(CreateProductRequest request);

    List<ProductResponse> findAll();

    ProductResponse findById(Long id);

    ProductResponse update(Long id, UpdateProductRequest request);

    void delete(Long id);
}

