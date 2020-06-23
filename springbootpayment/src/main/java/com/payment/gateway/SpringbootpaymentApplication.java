package com.payment.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration 
@ComponentScan(basePackages = "com.payment.gateway")
public class SpringbootpaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpaymentApplication.class, args);
	}

}
