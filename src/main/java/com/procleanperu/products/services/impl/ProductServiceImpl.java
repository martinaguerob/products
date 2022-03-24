package com.procleanperu.products.services.impl;

import com.procleanperu.products.entities.Products;
import com.procleanperu.products.repositories.ProductRepository;
import com.procleanperu.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Products> findAll() {
        List<Products> products =productRepository.findAll();
        return  products;
    }

    @Override
    public Mono<Products> save(Products entity) {
        return null;
    }

    @Override
    public Mono<Products> updateById(Products entity, Double aDouble) {
        return null;
    }

    @Override
    public Mono<Products> deleteById(Double aDouble) {
        return null;
    }

    @Override
    public Mono<Products> findById(Double aDouble) {
        return null;
    }
}
