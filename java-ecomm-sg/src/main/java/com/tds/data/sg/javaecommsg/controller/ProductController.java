package com.tds.data.sg.javaecommsg.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;
import com.tds.data.sg.javaecommsg.model.Product;
import com.tds.data.sg.javaecommsg.service.ProductService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:3000")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public ResponseEntity<?> getAllProducts() {
		List<Product> popularIdList = productService.findAll();
		if (popularIdList == null || popularIdList.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return new ResponseEntity<>(popularIdList, HttpStatus.OK);
	}

	@PostMapping("/products/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Product product = productService.findById(id).orElse(null);
		if (product != null) {

			return ResponseEntity.ok(product);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/cart")
	public String hello() {
		return "Hello";
	}

	@PostMapping("/add")
	public ResponseEntity<?> saveTransaction(@RequestBody Product entity) {
		// entity.setId(1);
		// entity.setName("Sam");
		// entity.setDesignation("Digital Mkt");
		productService.insert(entity);
		return ResponseEntity.ok(entity);
	}

}
