package com.wrgsistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrgsistemas.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{
	
}
