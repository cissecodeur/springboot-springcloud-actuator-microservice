package com.cisse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.cisse.dao.CompanyRepository;
import com.cisse.entities.Company;
import com.sun.el.stream.Stream;

@EnableDiscoveryClient //// activer la publication de la reference de notre microservice dans l'annuaire Eureka
@SpringBootApplication
public class ServiceSocieteApplication implements CommandLineRunner {
	
	@Autowired
	private CompanyRepository companyRepository;

	public static void main(String[] args) {
		SpringApplication.run(ServiceSocieteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<String> companies = new ArrayList<>();
		companies.add("SOCOCE");
		companies.add("MARCHE-GOURO");
		companies.add("SOCOFRAIS");
		
		companies.stream().forEach(c->{
			companyRepository.save(new Company(null,c,100*Math.random()*900));
		});
		
		companyRepository.findAll().forEach(System.out::println);
		
	}
	
	//Les methodes @Bean sont des methodes qui s'executeront au demarage
	
	

}
