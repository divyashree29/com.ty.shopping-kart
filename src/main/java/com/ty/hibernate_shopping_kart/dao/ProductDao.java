package com.ty.hibernate_shopping_kart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.cj.protocol.Resultset.Type;
import com.ty.hibernate_shopping_kart.dto.Product;

public class ProductDao {

	public Product saveProduct(Product product) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		System.out.println("-------------Done-------------");
		
		return product;
		}
	
	public Product getProductById(int a) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Product.class, a);
		
		}
	
	public List<Product> getProductByBrand(String brand) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.brand = ?1 ");
		query.setParameter(1, brand);
		List<Product> product1 = query.getResultList();
		return product1;
		}
	
	public List<Product> getProductByPrice(double price){
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Query query = entityManager.createNamedQuery("SELECT p FROM product p WHERE p.price = ?1 ");
	query.setParameter(1, price);
	List<Product> product1 = query.getResultList();
	return product1;
	}
	
    public List<Product> getProductByType(String type){
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	
    	Query query = entityManager.createNamedQuery("SELECT p FROM product P WHERE p.type = ?1");
    	query.setParameter(1, type);
    	List<Product> product1 = query.getResultList();
    	return product1;
    	 }
    
    public List<Product> getProductBySize(double size){
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
