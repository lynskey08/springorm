package com.gareth.spring.springorm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gareth.spring.springorm.product.dao.ProductDao;
import com.gareth.spring.springorm.product.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//@Transactional - tells spring framework that this method should be wrapped around a transaction
	@Override
	@Transactional(readOnly = false)
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	@Transactional
	public Product find(int id) {
		//we need to tell it what type of entity should be returned
		//in our case it is the Product.class and the id field
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> product = hibernateTemplate.loadAll(Product.class);
		return product;
	}

}
