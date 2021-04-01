package com.learning.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.dao.ProductDAO;
import com.learning.model.Product;

@Controller
public class HomeController {
	
	@Autowired
	private ProductDAO dao;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping(value="/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product p) {
		dao.addProduct(p);
		return "showresult";
	}
	@RequestMapping("/getProducts")
	public String getProducts(Model m) {
		//List<Product> productList = Arrays.asList(new Product(101, "HP"), new Product(102, "Acer"));
		m.addAttribute("product", dao.getProducts());
		return "showresult";
	}
	@RequestMapping("/getProduct")
	public String getProduct(@RequestParam int pid, Model m) {
		m.addAttribute("product", dao.getProduct(pid));
		return "showresult";
	}
}
