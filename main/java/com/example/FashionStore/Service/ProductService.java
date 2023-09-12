package com.example.FashionStore.Service;

import com.example.FashionStore.Entity.Product;

public interface ProductService {

	Product addproduct(Product product);
	
	Product updateproduct(String productname, Product product);
	
	void deleteproduct(String productname);
}
