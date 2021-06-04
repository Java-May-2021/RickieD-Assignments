package com.rickied.productsCategories.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rickied.productsCategories.Models.Category;
import com.rickied.productsCategories.Models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}
