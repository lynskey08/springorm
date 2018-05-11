package com.gareth.spring.springorm.product.dao.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gareth.spring.springorm.product.dao.ProductDao;
import com.gareth.spring.springorm.product.entity.Product;

@Component
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional//tells spring framework that this method should be wrapped around a transaction
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

}
