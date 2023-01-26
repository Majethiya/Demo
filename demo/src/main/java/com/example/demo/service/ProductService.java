package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ProductEntity;

public interface ProductService {
	
	public int add(ProductEntity product);
	public int edit(ProductEntity product,Long id);
	
	public ProductEntity findbyid(Long id);
	
	public List<ProductEntity>getAll();
	public int delete(Long id);
	
	
	

}
