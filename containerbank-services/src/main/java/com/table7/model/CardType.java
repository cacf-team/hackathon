package com.table7.model;

import org.springframework.data.annotation.Id;

public class CardType {
	
	@Id
	private Integer id;
	private String name;

	

	public CardType(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CardType() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
