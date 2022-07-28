package com.example.e_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringMicroservices4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservices4Application.class, args);
	}

}
