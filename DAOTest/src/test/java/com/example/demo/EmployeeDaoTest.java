package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.DAOException;
import com.example.demo.dao.impl.jpa.EmployeeDao;
import com.example.demo.model.Employee;

@SpringBootTest
public class EmployeeDaoTest {
	@Autowired
	EmployeeDao employeedao;
	@Test
	public void test() throws DAOException{
		employeedao.create(new Employee("Liu","Liu4444","4444","taipei"));
		System.out.println("add employee success");
	}
}
