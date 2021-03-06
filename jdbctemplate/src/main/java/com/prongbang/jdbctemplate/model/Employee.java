package com.prongbang.jdbctemplate.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Serializable {

	private static final long serialVersionUID = -4379714950236379056L;

	private Integer id;
	private String name;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
