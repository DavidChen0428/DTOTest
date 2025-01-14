package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	List<Employee> findById(int employeeId);
	
	@Query(value="SELECT * FROM employee WHERE employee_id BETWEEN :start AND :end",nativeQuery=true)
	List<Employee> employeeIdRange(@Param("start") int start,@Param("end") int end);
	
	@Query(value="SELECT * FROM employee WHERE employee_id < :id",nativeQuery=true)
	List<Employee> employeeIdBefore(@Param("id") int id);

	@Query(value="SELECT * FROM employee WHERE employee_id >:id",nativeQuery=true)
	List<Employee> employeeIdAfter(@Param("id") int id);
	
	boolean existsByName(String name);
	boolean existsByUsername(String username);
	boolean existsByPassword(String password);
	boolean existsByAddress(String address);
}
