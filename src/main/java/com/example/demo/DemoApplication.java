package com.example.demo;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context.getBean("idService"));
		System.out.println(context.getBean("idDao"));
		System.out.println();;

		
	}

}
