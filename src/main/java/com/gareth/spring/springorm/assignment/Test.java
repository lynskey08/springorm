package com.gareth.spring.springorm.assignment;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gareth/spring/springorm/assignment/config.xml");
		PassengerDao passengerDao = (PassengerDao) ctx.getBean("passengerDao");
//		Passenger passenger = new Passenger();
//		passenger.setId(5);
//		passenger.setFirstName("Aoife");
//		passenger.setLastName("FeeFiFo");
		//passengerDao.create(passenger);
		//passengerDao.update(passenger);
		//passengerDao.delete(passenger);
		
		//Passenger passenger = passengerDao.find(4);
		List<Passenger> passenger = passengerDao.findAll();
		System.out.println(passenger);
	}
}
