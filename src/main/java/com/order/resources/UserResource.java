package com.order.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entities.UserEntity;

@RestController 
@RequestMapping (value= "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<UserEntity> findAll(){
		UserEntity u = new UserEntity (1L, "Lorena", "lorena@gmail.com", "333333",  "1234-56789");
		return ResponseEntity.ok().body(u);
		
	}
	

}
