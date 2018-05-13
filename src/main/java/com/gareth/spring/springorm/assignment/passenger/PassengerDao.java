package com.gareth.spring.springorm.assignment.passenger;

import java.util.List;

public interface PassengerDao {
	
	int create(Passenger passenger);
	
	void update(Passenger passenger);
	
	void delete(Passenger passenger);
	
	Passenger find(int id);
	
	List<Passenger> findAll();
}
