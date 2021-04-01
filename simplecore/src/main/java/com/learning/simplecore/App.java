package com.learning.simplecore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
//    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Product obj = (Product)context.getBean("product");
//    	obj.setPrice(12000);
        obj.code();
        System.out.println(obj.getPrice());
        
//        Product obj2 = (Product)context.getBean("product");
//        obj2.code();
//        System.out.println(obj2.getPrice());
        
    }
}
