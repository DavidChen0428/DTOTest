package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.dto.UserOrderProjection;

@Service
public class UserOrderService {
	@Autowired
	UserRepository userrepository;
	
	public List<UserOrderProjection> getUserOrders(){
		return userrepository.fetchUserOrders();
	}
}
