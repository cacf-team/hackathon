/**
 * 
 */
package com.table7.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author hackathon
 *
 */
public class Card {

	@Id
	private Integer id;
	private String name;
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date birthDate;
	private Integer cardType;
	private Integer costumerId;

	public Card() {
		super();
	}

	public Card(Integer id, String name, Date birthDate, Integer type, Integer customerId) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.setCardType(type);
		this.costumerId = customerId;
	}

	public Integer getCostumerId() {
		return costumerId;
	}

	public void setCostumerId(Integer costumerId) {
		this.costumerId = costumerId;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}


}
