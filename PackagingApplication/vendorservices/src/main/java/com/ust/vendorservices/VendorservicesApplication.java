package com.ust.vendorservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VendorservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorservicesApplication.class, args);
	}

}
