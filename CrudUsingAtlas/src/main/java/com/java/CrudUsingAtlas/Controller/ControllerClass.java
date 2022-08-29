package com.java.CrudUsingAtlas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.CrudUsingAtlas.Model.Product;
import com.java.CrudUsingAtlas.Service.ServiceClass;

@RestController
@RequestMapping("/product")
public class ControllerClass {

	@Autowired
	private ServiceClass service;
	
	@GetMapping
	public List<Product> getAllProduct() {
		return service.findAll();
	}
	@PostMapping
	public Product saveAllProduct(@RequestBody Product product) {
		return service.save(product);
	}
	/*
	 * public Product deleteproduct(Product product) { return service.deleteAll(); }
	 */
}
