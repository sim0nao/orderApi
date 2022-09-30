package com.order.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.order.entities.CategoryEntity;
import com.order.entities.OrderEntity;
import com.order.entities.UserEntity;
import com.order.entities.enums.OrderStatus;
import com.order.repository.CategoryRepository;
import com.order.repository.OrderRepository;
import com.order.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		CategoryEntity cat1 = new CategoryEntity(null, "Electronics");
		CategoryEntity cat2 = new CategoryEntity(null, "Books");
		CategoryEntity cat3 = new CategoryEntity(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		UserEntity u1 = new UserEntity(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		UserEntity u2 = new UserEntity(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		OrderEntity o1 = new OrderEntity(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID); 
		OrderEntity o2 = new OrderEntity(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAINTING_PAID); 
		OrderEntity o3 = new OrderEntity(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.PAID); 
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	

}
