package com.wrgsistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrgsistemas.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{
	
}
