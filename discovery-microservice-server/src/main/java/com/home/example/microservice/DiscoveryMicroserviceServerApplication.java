/**
 * 
 */
package com.home.example.microservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author Ahmed LAOUEDJ
 *
 */
@SpringBootApplication
@EnableEurekaServer
@EnableConfigurationProperties
public class DiscoveryMicroserviceServerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryMicroserviceServerApplication.class, args);

	}

}
