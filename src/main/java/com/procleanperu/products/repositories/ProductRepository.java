package com.procleanperu.products.repositories;

import com.procleanperu.products.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Double> {
    
}
