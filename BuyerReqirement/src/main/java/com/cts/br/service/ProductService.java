package com.cts.br.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.br.dao.ProductRepository;
import com.cts.br.model.Product;


public class ProductService {
	@Autowired
	ProductRepository repo;
	List<Product> getAllProducts(){
		return (List<Product>).getAllProducts();
	}
	
}
