package com.springboot.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		//Returns object of ApplicationContext -->> SpringApplication.run(SpringBoot1Application.class, args);
		ApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);
		
		Demo1 obj = context.getBean(Demo1.class);
		
		obj.code();
	}

}
