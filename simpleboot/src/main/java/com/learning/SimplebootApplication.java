package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimplebootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SimplebootApplication.class, args);
		Product product = context.getBean(Product.class);
		product.code();
	}

}
