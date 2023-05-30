package com.Springboot.HibernateInheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pmode",discriminatorType = DiscriminatorType.STRING)
public class Payment {

	
	@Id
	private int id;
	private double ammount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	
	
}
