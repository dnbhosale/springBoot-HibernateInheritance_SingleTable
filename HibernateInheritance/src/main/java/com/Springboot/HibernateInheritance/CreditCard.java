package com.Springboot.HibernateInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "cc")
public class CreditCard extends Payment{
	
	private String cardNumber;

	public String getCreditCard() {
		return cardNumber;
	}

	public void setCreditCard(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
	

}
