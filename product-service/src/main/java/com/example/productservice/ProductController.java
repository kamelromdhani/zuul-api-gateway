package com.example.productservice;

import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
		
		private static List<Product> productList = new ArrayList<>();
	    static {
	    	productList.add(new Product(1, "product-1"));
	    	productList.add(new Product(2, "product-2"));
	    	productList.add(new Product(3, "product-3"));
	    }

	    @GetMapping("/products")
	    public ResponseEntity<?> getMovies() {

	        return ResponseEntity.ok(productList);

	    }
		
	}

