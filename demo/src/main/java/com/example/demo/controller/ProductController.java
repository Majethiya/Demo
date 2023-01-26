package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

	@Autowired 
	ProductService ps; 
	
	
	@PostMapping("/add")
	public int AddProduct(@RequestBody ProductEntity product) {
		
		System.out.println("in save...!");
		int status=ps.add(product);
		if(status>0) {
			return 1;
		}else {
			return 0;			
		}
	}
	@PutMapping("/edit/{id}")
	public int AddProduct(@RequestBody ProductEntity product,@PathVariable Long id) {
		
		System.out.println("in edit...!");
		int status=ps.edit(product, id);
		if(status>0) {
			return 1;
		}else {
			return 0;			
		}
	}
	
	@GetMapping("/getAll")
	public List<ProductEntity> AddProduct() {
		
		System.out.println("in get all...!");
		return ps.getAll();
	
	}
	@GetMapping("/get/{id}")
	public ProductEntity getOne(@PathVariable Long id) {
		
		System.out.println("in get by id all...!");
		return ps.findbyid(id);
	
	}
	@DeleteMapping("/delete/{id}")
	public int deletet(@PathVariable Long id) {
		System.out.println("in delete...!");
		return ps.delete(id);
	
	}
}
