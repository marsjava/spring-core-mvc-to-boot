package com.learning.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.model.Product;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("message", "DigitalHub Product Details here...");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
//	@RequestMapping("/add")
//	public String add(HttpServletRequest req) {
//		int prodId = Integer.parseInt(req.getParameter("pid"));
//		String prodName = req.getParameter("pname");
//		HttpSession session = req.getSession();
//		session.setAttribute("pid", prodId);
//		session.setAttribute("pname", prodName);
//		return "result.jsp";
//	}
	
//	@RequestMapping("/add")
//	public String add(@RequestParam("pid") int id, @RequestParam("pname") String name, HttpSession session) {
//		session.setAttribute("pid", id);
//		session.setAttribute("pname", name);
//		return "result.jsp";
//	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("pid") int id, @RequestParam("pname") String name) {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("pid", id);
		mv.addObject("pname", name);
		return mv;
	}
	
//	@RequestMapping("/addProduct")
//	public String addProduct(@RequestParam("pid") int id, @RequestParam("pname") String name, Model m) {
//		Product p = new Product();
//		p.setPid(id);
//		p.setPname(name);
//		m.addAttribute("product", p);
//		return "showresult";
//	}
	
	@RequestMapping(value="/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("prod") Product p) {
		return "showresult";
	}
	
	
	
}











