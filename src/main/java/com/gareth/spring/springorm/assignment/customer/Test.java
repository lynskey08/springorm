package com.gareth.spring.springorm.assignment.customer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gareth.spring.springorm.product.dao.ProductDao;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gareth/spring/springorm/assignment/customer/config.xml");
		CustomerDao customerDao = (CustomerDao) ctx.getBean("customerDao");
//		Customer customer = new Customer();
//		customer.setId(6);
//		customer.setFirstName("Seamus");
//		customer.setLastName("Hennigan");
//		customer.setAge(21);
		//customerDao.create(customer);
		//customerDao.update(customer);
		//customerDao.delete(customer);
		
		//Customer customer = customerDao.find(4);
		List<Customer> customer = customerDao.findAll();
		System.out.println(customer);
	}

}
