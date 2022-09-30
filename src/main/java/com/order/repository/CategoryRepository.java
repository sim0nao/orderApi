package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository <CategoryEntity, Long> {
	
	

}
