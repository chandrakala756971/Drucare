package com.example.demo.controller;
import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Products;
import com.example.demo.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
@RequestMapping("/Products")
	public List<Products> getAllProducts() {
		return productService.getAllProducts();
	}
@RequestMapping("/Products/{id}")
public Products getProduct(@PathVariable String id) {
	return productService.getProduct(id);
}
@RequestMapping(method=RequestMethod.POST,value="/Products")
public void addProducts(@RequestBody Products product) {
	 productService.addProducts(product);
}
@RequestMapping(method = RequestMethod.PUT,value = "/Products/{id}")
public  void  updateProduct(@RequestBody Products product,@PathVariable String  id) {
	productService.updateProduct(id,product);
}
@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
public void deleteTopic(@PathVariable String id ) {
	productService.deleteTopic(id);
}
}
