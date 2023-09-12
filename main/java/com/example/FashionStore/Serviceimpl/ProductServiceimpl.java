package com.example.FashionStore.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FashionStore.Entity.Product;
import com.example.FashionStore.Exception.ResourceNotFoundException;
import com.example.FashionStore.Repository.ProductRepo;
import com.example.FashionStore.Service.ProductService;

@Service
public class ProductServiceimpl implements ProductService{

	@Autowired
	ProductRepo productrepo;
	@Override
	public Product addproduct(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}

	@Override
	public Product updateproduct(String productname, Product product) {
		// TODO Auto-generated method stub
		Product s1=productrepo.findByName(productname);
		
		if(s1!=null) {
			
			s1.setProductdesc(product.getProductdesc());
			s1.setProductlink(product.getProductlink());
			return productrepo.save(s1);
		}
		else {
			throw new ResourceNotFoundException();		}
	}

	@Override
	public void deleteproduct(String productname) {
		// TODO Auto-generated method stub
		Product s2=productrepo.findByName(productname);
		if(s2!=null)
		{
		productrepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();	
		}
	}

}
