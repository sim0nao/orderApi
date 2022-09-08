package com.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entities.UserEntity;
import com.order.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserEntity> findAll(){
		return repository.findAll();
	};
	
	public UserEntity findById(Long id) {
		Optional <UserEntity> obj = repository.findById(id);
		return obj.get();
	}
	
	

}
