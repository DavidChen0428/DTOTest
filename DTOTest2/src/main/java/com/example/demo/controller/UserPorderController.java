package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dto.UserPorderDTO;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("api")
public class UserPorderController {
	@Autowired
	UserService userservice;
	
	@GetMapping("/user-orders") 
	public List<UserPorderDTO> getUserOrdersDetails() {
		return userservice.getUserPorderDetails();
	}
	
}
