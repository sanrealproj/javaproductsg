package com.tds.discovery.sg.service.javadiscoverysg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JavaDiscoverySgApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDiscoverySgApplication.class, args);
	}

}
