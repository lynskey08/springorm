package com.gareth.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gareth.spring.springorm.product.dao.ProductDao;
import com.gareth.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gareth/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productDao");
//		Product product = new Product();
//		product.setId(1);
//		product.setName("Iphone");
//		product.setDesc("It's awesome");
//		product.setPrice(899);
		//productDao.create(product);
		//productDao.update(product);
		//productDao.delete(product);
		
		//fetch a single record
		//Product product = productDao.find(2);
		//System.out.println(product);
		
		//fetch all records
		List<Product> product = productDao.findAll();
		System.out.println(product);
		
	}
}