package com.ty.hibernate_shopping_kart.service;

import java.util.List;

import com.ty.hibernate_shopping_kart.dao.ProductDao;
import com.ty.hibernate_shopping_kart.dto.Product;

public class ProductService {

	 public Product saveProduct(Product product) {
		 
		 ProductDao dao = new ProductDao();
		return  dao.saveProduct(product);
	
	 }
	 
	 public void getProductById(int a) {
		  
		 ProductDao dao = new ProductDao();
		 Product product = dao.getProductById(a);
		 if(product != null) {
			 System.out.println("ID is"+product.getId());
			 System.out.println("Name is "+product.getName());
			 System.out.println("Brand is "+product.getBrand());
			 System.out.println("Price is "+product.getPrice());
			 System.out.println("Type is "+product.getPrice());
			 System.out.println("Rating is "+product.getRating());
			 System.out.println("Size is "+product.getSize());
			  }else
				  System.out.println("No product");
		}
	 
	 public void getProductByBrand(String brand) {
		 
		 ProductDao dao = new ProductDao();
		 List<Product> product = dao.getProductByBrand(brand);
		 if(product.size()>0) {
			 for(Product products : product) {
				 System.out.println("ID is"+products.getId());
				 System.out.println("Name is "+products.getName());
				 System.out.println("Brand is "+products.getBrand());
				 System.out.println("Price is "+products.getPrice());
				 System.out.println("Type is "+products.getType());
				 System.out.println("Rating is "+products.getRating());
				 System.out.println("Size is "+products.getSize());
				  }
		 }
		 else{
			  System.out.println("No product");
		 }
	 }
	 
	 public void getProductByPrice(double price) {
		 
		 ProductDao dao = new ProductDao();
		 List<Product> product = dao.getProductByPrice(price);
		 if(product.size()>0) {
			 for(Product products : product) {
				 System.out.println("ID is"+products.getId());
				 System.out.println("Name is "+products.getName());
				 System.out.println("Brand is "+products.getBrand());
				 System.out.println("Price is "+products.getPrice());
				 System.out.println("Type is "+products.getType());
				 System.out.println("Rating is "+products.getRating());
				 System.out.println("Size is "+products.getSize());
				  }
		 }
		 else{
			  System.out.println("No product");
		 }
		 
	 }
	 public void getproductByType(String type) {
		 ProductDao dao = new ProductDao();
		 List<Product> product = dao.getProductByType(type);
		 if(product.size()>0) {
			 for(Product products : product) {
				 System.out.println("ID is"+products.getId());
				 System.out.println("Name is "+products.getName());
				 System.out.println("Brand is "+products.getBrand());
				 System.out.println("Price is "+products.getPrice());
				 System.out.println("Type is "+products.getType());
				 System.out.println("Rating is "+products.getRating());
				 System.out.println("Size is "+products.getSize());
				  }
		 }
		 else{
			  System.out.println("No product");
		 }
	 }
	 
}
    
