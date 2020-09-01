package com.cisse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient // activer la decouverte de notre serveur proxy
public class ServiceProxyMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProxyMsApplication.class, args);
	}

}
