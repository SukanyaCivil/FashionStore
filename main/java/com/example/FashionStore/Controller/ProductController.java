package com.example.FashionStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.FashionStore.Entity.Product;
import com.example.FashionStore.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@PostMapping("/post")
	public Product addproduct(@RequestBody Product product) {
		return productservice.addproduct(product);
	}
	
	@PutMapping("/update")
	public Product update(@RequestHeader String productname, @RequestBody Product product) {
		return productservice.updateproduct(productname, product);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String productname) {
		productservice.deleteproduct(productname);
		return "Data was deleted";
	}
}
