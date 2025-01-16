package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.dto.UserPorderDTO;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;
	
	public List<UserPorderDTO> getUserPorderDetails(){
		return userrepository.findUserPorderDetails();
	}
}
