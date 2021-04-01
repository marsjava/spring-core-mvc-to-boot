package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
	@Autowired
	Laptop laptop;
	public void code() {
		laptop.compile();
	}
}
