package com.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entities.OrderEntity;
import com.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<OrderEntity> findAll(){
		return repository.findAll();
	};
	
	public OrderEntity findById(Long id) {
		Optional <OrderEntity> obj = repository.findById(id);
		return obj.get();
	}
	
	

}
