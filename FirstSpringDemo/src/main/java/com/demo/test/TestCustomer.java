package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Customer c1 = (Customer) ctx.getBean("c1");
		System.out.println(c1);
		Customer c2 = (Customer) ctx.getBean("c2");
		System.out.println(c2);
		Customer c3 = (Customer) ctx.getBean("c1");
		System.out.println(c3);

	}

}
