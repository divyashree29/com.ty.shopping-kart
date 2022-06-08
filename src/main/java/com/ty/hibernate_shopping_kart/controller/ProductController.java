package com.ty.hibernate_shopping_kart.controller;

import com.ty.hibernate_shopping_kart.dto.Product;
import com.ty.hibernate_shopping_kart.service.ProductService;

public class ProductController {
    
	public static void main(String[] args) {
		
		ProductService productservice = new ProductService();
//		Product product = new Product();
		
//		product.setId(1);
//		product.setName("Bag");
//		product.setBrand("wildcraft");
//		product.setPrice(1200.00);
//		product.setType("leather");
//		product.setSize(10);
//		product.setRating(5);
		
//		productservice.saveProduct(product);
		
	//	productservice.getProductById(1);
		
	//	productservice.getProductByBrand("wildcraft");
		
	//	productservice.getProductByPrice(1300.00);
		
		productservice.getproductByType("local");
		}
	
	
}
