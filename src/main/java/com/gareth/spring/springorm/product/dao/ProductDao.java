package com.gareth.spring.springorm.product.dao;

import com.gareth.spring.springorm.product.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
}
