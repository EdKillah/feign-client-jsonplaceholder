package com.microservice.feingclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeingclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeingclientApplication.class, args);
	}

}
