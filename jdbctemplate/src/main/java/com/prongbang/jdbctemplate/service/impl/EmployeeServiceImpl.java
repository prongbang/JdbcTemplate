package com.prongbang.jdbctemplate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prongbang.jdbctemplate.dao.EmployeeDao;
import com.prongbang.jdbctemplate.model.Employee;
import com.prongbang.jdbctemplate.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int add(Employee entity) throws Exception {
		
		return employeeDao.add(entity);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int update(Employee entity) throws Exception {
		
		return employeeDao.update(entity);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int delete(Employee entity) throws Exception {
		
		return employeeDao.delete(entity);
	}

	@Override
	public Employee findById(Employee entity) throws Exception {
		
		return employeeDao.findById(entity);
	}

	@Override
	public List<Employee> findAll() throws Exception {
		
		return employeeDao.findAll();
	}

}
