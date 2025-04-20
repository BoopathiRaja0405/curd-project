package com.example.simpleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.simpleproject.model.*;
import com.example.simpleproject.sevice.*;
import java.util.*;

@Controller
public class ProductController {
	
	@Autowired
	ProductService s;
	
	@GetMapping("/addProduct")
	public String get3(Model model) {
		model.addAttribute("product",new Product());
		return "add";
	}
	
	@PostMapping("/addProduct")
	public String get4(Product p) {
		s.get(p);
		return "success";
	}
	
	@GetMapping("/ProductList")
	public String get5(Model model) {
		model.addAttribute("ProductList",s.get1());
		return "list";
	}
			
	@GetMapping("/particular/{id}")
	public String get6(@PathVariable long id,Model m)
	{
		Optional<Product>p=s.get2(id);
		if(p.isPresent()) {
			m.addAttribute("abc",p.get());
			return "part";
		}
		else {
			return "error";
		}
	}
	
	@GetMapping("del/{id}")
	public String get7(@PathVariable long id,Model m)
	{
		s.removedata(id);
		return "del";
	}

}
