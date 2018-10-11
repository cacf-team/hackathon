package com.table7.model;

import org.springframework.data.annotation.Id;

public class Person {
	
	@Id
	private Integer id;
	private String firstname;	
	private String lastname;	
	
	
	
	public Person () {
		super();
	}
	
	public Person( String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


}
