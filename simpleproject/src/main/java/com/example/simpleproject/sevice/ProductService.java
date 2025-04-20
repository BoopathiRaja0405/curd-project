package com.example.simpleproject.sevice;
import com.example.simpleproject.dao.*;

import com.example.simpleproject.model.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductResp r;
	
	public void get(Product p) {
		r.save(p);
	}
	public List<Product> get1(){
		return r.findAll();
	}
	public Optional <Product>get2(long id)
	{
		return r.findById(id);
	}
	public void removedata(long id)
	{
		r.deleteById(id);
	}
}
