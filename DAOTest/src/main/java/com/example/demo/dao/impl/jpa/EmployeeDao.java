package com.example.demo.dao.impl.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.DAO;
import com.example.demo.dao.DAOException;
import com.example.demo.dao.impl.EmployeeRepository;
import com.example.demo.model.Employee;
@Repository
public class EmployeeDao implements DAO<Employee> {
	@Autowired
	EmployeeRepository employeerepository;

	@Override // 單一新增
	public void create(Employee t) throws DAOException {
		employeerepository.save(t);
	}

	@Override // 
	public Employee findById(int id) throws DAOException {
		if(id>0) {
			return employeerepository.findById(id).get(0);
		}else {
			throw new DAOException("findById():員工編號不能小於0:"+id);
		}
	}

	@Override
	public List<Employee> findRange(int key1, int key2) throws DAOException {
		List<Employee> list=null;
		if(key1<=key2) {
			list=employeerepository.employeeIdRange(key1, key2);
		}else {
			list=employeerepository.employeeIdRange(key2, key1);
		}
		if(list==null) {
			throw new DAOException("findRange():查無資料:"+list);
		}
		return list;
	}

	public List<Employee> findRange(String prefix,int key)throws DAOException{
		if(prefix==null||prefix.isEmpty()) {
			throw new DAOException("findRange():prefix不存在,無法選定方法");
		}
		if((prefix.toUpperCase()).equals("BEFORE")) {
			return employeerepository.employeeIdBefore(key);
		}else if((prefix.toUpperCase()).equals("AFTER")) {
			return employeerepository.employeeIdAfter(key);
		}else {
			throw new DAOException("findRange():前贅詞不正確:"+prefix.toUpperCase());
		}
		
	}
	

	@Override
	public List<Employee> findAll() throws DAOException {
		List<Employee> list=employeerepository.findAll();
		if(list.size()!=0) {
			return list;
		}else {
			throw new DAOException("findAll():查無資料:"+list);
		}
	}

	@Override
	public void update(Employee t) throws DAOException {
		if(t==null || t.getEmployeeId()==null) {
			throw new DAOException("update():update錯誤,物件空值/employeeId空值");
		}
		if(!employeerepository.existsById(t.getEmployeeId())) {
			throw new DAOException("update():查無此employeeId");
		}
		employeerepository.save(t);
	}

	@Override
	public void deleteById(int key) throws DAOException {
		if(findById(key)!=null) {
			employeerepository.deleteById(key);
		}else {
			throw new DAOException("deleteById():查無此employeeId");
	}
}

}
