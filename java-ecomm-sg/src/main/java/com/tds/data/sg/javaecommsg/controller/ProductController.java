package com.tds.data.sg.javaecommsg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

@RestController
public class ProductController {

	/*
	 * @Autowired private DiscoveryClient client;
	 * 
	 * @Value("${spring.application.name}") private String serviceId;
	 * 
	 * @GetMapping("/service/instances") public ResponseEntity<?> testApp() {
	 * 
	 * return ResponseEntity.ok(client.getInstancesById(serviceId));
	 * 
	 * }
	 */

}
