package com.table7.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Advisor extends Person {
	
	
	
	private List<Integer> specialties;
	
	public Advisor() {
		super();
	}

	public Advisor( String firstname, String lastname,  List<Integer> specialties) {
		super(firstname,lastname);
		
		this.specialties = specialties;
	}

	
	public List<Integer>  getSpecialties() {
		return specialties;
	}

	public void setSpecialties(List<Integer>  specialties) {
		this.specialties = specialties;
	}
	
	
	
	

}
