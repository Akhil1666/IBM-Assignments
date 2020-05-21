package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepo extends CrudRepository<Product, Long>{

}
