package com.prongbang.jdbctemplate.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.prongbang.jdbctemplate.dao.AbstractDao;
import com.prongbang.jdbctemplate.model.Employee;

@Repository
public class EmployeeDaoImpl implements AbstractDao<Employee> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int add(Employee entity) throws Exception {
		
		String sql = "INSERT INTO Employee (name, age) VALUES (?, ?)";
		
		KeyHolder holder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				
				PreparedStatement ps = conn.prepareStatement(sql, new String[]{ "id" });
				
				ps.setString(1, entity.getName());
				ps.setInt(2, entity.getAge());
				
				return ps;
			}
		}, holder);
		
		int id = holder.getKey().intValue();
		
		return id;
	}

	@Override
	public int update(Employee entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Employee entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(Employee entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
