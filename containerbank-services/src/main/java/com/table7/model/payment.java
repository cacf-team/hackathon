package com.table7.model;

import org.springframework.data.annotation.Id;

public class payment {
	
	@Id
	private Integer id;
	private String paymentDate;
	private String Description;
	private Card cardId;
	public payment() {
		super();
	}
	public payment(Integer id, String paymentDate, String description, Card cardId) {
		super();
		this.id = id;
		this.paymentDate = paymentDate;
		Description = description;
		this.cardId = cardId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Card getCardId() {
		return cardId;
	}
	public void setCardId(Card cardId) {
		this.cardId = cardId;
	}
	
	

}
