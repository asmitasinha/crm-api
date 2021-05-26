package com.vertisage.crm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vertisage.crm.controller")
public class CrmApplication{
	
	public static void main(String []args) {
		
		SpringApplication.run(CrmApplication.class, args);
		System.out.println("CRM Application");
	}
}