package com.dev.seviceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SeviceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeviceDiscoveryApplication.class, args);
	}

}
