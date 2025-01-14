package com.example.demo.dao;

import java.util.List;

public interface DAO<T> {
	// create
	void create(T t) throws DAOException;
	
	// read
	T findById(int id) throws DAOException;
	List<T> findRange(int key1,int key2) throws DAOException;
	List<T> findAll() throws DAOException;
	// update
	void update(T t) throws DAOException;
	
	// delete
	void deleteById(int key) throws DAOException;
	
	
}
