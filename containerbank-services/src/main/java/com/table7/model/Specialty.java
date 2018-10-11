package com.table7.model;

import org.springframework.data.annotation.Id;

public class Specialty {

	@Id
	private Integer id;
	private String name;
	public Specialty() {
		super();
	}
	public Specialty( String name) {
		super();
		this.name = name;
	}
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
	
}
