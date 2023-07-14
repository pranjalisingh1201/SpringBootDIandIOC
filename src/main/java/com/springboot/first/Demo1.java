package com.springboot.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Demo1 {
	@Autowired
	Demo2 laptop;

	public void code()
	{
		//System.out.println("Application Context Interface Implementations.");
		
		laptop.compile();
	}
}
