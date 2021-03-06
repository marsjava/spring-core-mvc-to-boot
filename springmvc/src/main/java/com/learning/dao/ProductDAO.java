package com.learning.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.model.Product;

@Component
@Transactional
public class ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Product> getProducts() {
		Session session = sessionFactory.getCurrentSession();
		List<Product> products = session.createQuery("from Product", Product.class).list();
		return products;
	}

	public Product getProduct(int pid) {
		Session session = sessionFactory.getCurrentSession();
		Product product = session.get(Product.class, pid);
		return product;		
	}
	
	public void addProduct(Product p) {
		Session session = sessionFactory.getCurrentSession();
		session.save(p);
	}
}
