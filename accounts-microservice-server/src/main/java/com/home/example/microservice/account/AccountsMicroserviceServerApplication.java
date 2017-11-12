package com.home.example.microservice.account;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Ahmed LAOUEDJ
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class AccountsMicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsMicroserviceServerApplication.class, args);
	}
	
}
