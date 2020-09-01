package com.cisse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceEnregistrementMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEnregistrementMsApplication.class, args);
	}

}
