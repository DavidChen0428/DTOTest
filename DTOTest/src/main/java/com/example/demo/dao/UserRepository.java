package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserOrderProjection;

public interface UserRepository extends JpaRepository<User,Integer>{
	@Query(value="SELECT u.id as userId, u.name as userName, o.product as product FROM User u JOIN `Order` o ON u.id = o.user_id",nativeQuery=true)
	List<UserOrderProjection> fetchUserOrders();
}
