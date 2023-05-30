package com.Springboot.HibernateInheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateInheritanceApplicationTests {

	@Autowired
	private PaymentRepository pr;

	@Test
	void contextLoads() {
	}
	@Test
	public void CreatePayment() {
		CreditCard cc=new CreditCard();
		cc.setId(1212);
		cc.setAmmount(16234);
		cc.setCreditCard("547454665878");
		pr.save(cc);
	}
	@Test
	public void createPayment2() {
		Check ch=new Check();
		ch.setAmmount(12313);
		ch.setCheckNumber("654676454765");
		ch.setId(212);
		pr.save(ch);
	}

}
