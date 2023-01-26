package com.example.demo.serviceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Resource
	ProductRepository repo;
	@Override
	public int add(ProductEntity product) {
		// TODO Auto-generated method stub
		return repo.save(product).hashCode();
	}
	@Override
	public List<ProductEntity> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public ProductEntity findbyid(Long id) {
		// TODO Auto-generated method stub
		return repo.findByid(id);
						
	}
	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return 1;
	}
	@Override
	public int edit(ProductEntity product,Long id) {
		// TODO Auto-generated method stub
		
		ProductEntity p=repo.findByid(id);
		p.setName(product.getName());
		p.setPrice(product.getPrice());
		p.setColor(product.getColor());
		p.setQty(product.getQty());
		p.setDate(product.getDate());
		return repo.save(p).hashCode();
		
	}

}
