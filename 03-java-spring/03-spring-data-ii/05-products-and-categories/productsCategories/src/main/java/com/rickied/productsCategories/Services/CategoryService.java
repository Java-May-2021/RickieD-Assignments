package com.rickied.productsCategories.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.productsCategories.Models.Category;
import com.rickied.productsCategories.Models.Product;
import com.rickied.productsCategories.Repositories.CategoryRepository;

@Service
public class CategoryService {
	
		//Dependency injection
		// adding the  repository as a dependency
		@Autowired
	  	private CategoryRepository categoryRepo;
		
	    // returns all the category
	    public List<Category> getAllCategories() {
	        return categoryRepo.findAll();
	    }
	    
	    // creates a category
	    public Category createCategory(Category newCategory) {
	        return categoryRepo.save(newCategory);
	    }
	    
	    
	    //Find a product
	    public Category getCategory(Long id) {
			return this.categoryRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
		}
	    
	    public List<Category> findCategoriesNotInProduct(Product product) {
	    	return this.categoryRepo.findByProductsNotContains(product);
	    }
	    
	 
		public void addProductToCategory(Product product, Category category) {
			List<Product> selectedProducts = category.getProducts();
			selectedProducts.add(product);
			this.categoryRepo.save(category);
		}
}
