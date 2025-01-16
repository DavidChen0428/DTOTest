package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserPorderDTO;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("SELECT new com.example.demo.model.dto.UserPorderDTO(u.id, u.name, p.product) FROM User as u JOIN u.porders as p")
	List<UserPorderDTO> findUserPorderDetails();
}
