package com.rickied.productsCategories.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickied.productsCategories.Models.Category;
import com.rickied.productsCategories.Models.Product;
import com.rickied.productsCategories.Repositories.ProductRepository;

@Service
public class ProductService {
	//Dependency injection
	@Autowired
	// adding the person repository as a dependency
  	private ProductRepository productRepo;
    
   
    // returns all the products
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    
    // creates a product
    public Product createProduct(Product newProduct) {
        return productRepo.save(newProduct);
    }
    
    
    //Find a product
    public Product getProduct(Long id) {
		return this.productRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}
    
    public List<Product> findProductsNotInCategory(Category category) {
    	return this.productRepo.findByCategoriesNotContains(category);
    }
	
	public void addCategoryToProduct(Product product, Category category) {
		List<Category> selectedCategories = product.getCategories();
		selectedCategories.add(category); 
		this.productRepo.save(product);
	}
}
