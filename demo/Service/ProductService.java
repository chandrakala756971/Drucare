package com.example.demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Products;
import com.example.demo.Repository.ProductRepository;


@Service
public class ProductService {
	@Autowired 
	ProductRepository productRepository;
	private List<Products> products=Arrays.asList(
			new Products("grocery","Grocery Products","flipkart"),
			new Products("electronics","Electronic Products","amazon"),
			new Products("fashion","Fashion Products","meesho"));
	public List<Products> getAllProducts(){
		return products;
	}
	public Products getProduct(String id) {
		return products.stream().filter(t->t.getpId().equals(id)).findFirst().get();
	}
	public void addProducts(Products product) {
		products.add(product);
	}

	public void updateProduct(String id, Products product) {
		for(int i= 0; i<products.size();i++) {
			if(products.get(i).getpId().equals(id)) {
				products.set(i, product);
			}
		}
//		productRepository.save(product);
	}


}

