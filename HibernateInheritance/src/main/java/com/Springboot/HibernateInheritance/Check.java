package com.Springboot.HibernateInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ch")
public class Check extends Payment {
	
	private String checkNumber;

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	

}
