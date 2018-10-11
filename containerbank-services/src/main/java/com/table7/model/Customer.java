package com.table7.model;

import org.springframework.data.annotation.Id;

public class Customer extends Person {
	
	@Id
	private String adress;
	private String city;
	private String telephone;
	
	public Customer() {
		super();
	}
	
	public Customer(String firstName, String lastName, String adress, String city, String telephone) {
		super(firstName, lastName);
	
		this.adress = adress;
		this.city = city;
		this.telephone = telephone;
	}



	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	
	
	

}
