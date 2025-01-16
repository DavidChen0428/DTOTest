package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dto.UserOrderProjection;
import com.example.demo.service.UserOrderService;

@RestController
@RequestMapping("api")
public class UserOrderController {
	@Autowired
	UserOrderService userorderservice;
	
	@GetMapping("/user-orders") 
	public List<UserOrderProjection> getUserOrders() {
		return userorderservice.getUserOrders();
	}
}
