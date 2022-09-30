package com.order.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entities.CategoryEntity;
import com.order.services.CategoryService;

@RestController 
@RequestMapping (value= "/categories")
public class CategoryResourse {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<CategoryEntity>> findAll(){
		List<CategoryEntity> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryEntity> findById(@PathVariable Long id){
		CategoryEntity order = service.findById(id);
		return ResponseEntity.ok().body(order);
	}

}
