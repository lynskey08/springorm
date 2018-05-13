package com.gareth.spring.springorm.assignment;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;;

	@Override
	@Transactional(readOnly=false)
	public int create(Passenger passenger) {
		Integer result = (Integer) hibernateTemplate.save(passenger);
		return result;
	}

	@Override
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
		
	}

	@Override
	public Passenger find(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, id);
		return passenger;
	}

	@Override
	public List<Passenger> findAll() {
		List<Passenger> passenger = hibernateTemplate.loadAll(Passenger.class);
		return passenger;
	}

}
