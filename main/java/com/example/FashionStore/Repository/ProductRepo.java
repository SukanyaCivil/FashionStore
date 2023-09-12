package com.example.FashionStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.FashionStore.Entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	@Query(value =  "select * from Product where productname =?" , nativeQuery = true)
	Product findByName(String productname);
}
