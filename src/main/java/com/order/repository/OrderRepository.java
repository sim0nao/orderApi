package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entities.OrderEntity;

public interface OrderRepository extends JpaRepository <OrderEntity, Long> {
	
	

}
