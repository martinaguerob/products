package com.procleanperu.products.repositories;

import com.procleanperu.products.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories, Double> {

}
