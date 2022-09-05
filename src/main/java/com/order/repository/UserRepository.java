package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entities.UserEntity;

public interface UserRepository extends JpaRepository <UserEntity, Long> {
	
	

}
