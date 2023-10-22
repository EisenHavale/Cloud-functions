package com.example.demo;

import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerlessCloudFunctionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerlessCloudFunctionsApplication.class, args);
	}

	@Bean
	public Function<String, String> reserveString(){
		return value -> new StringBuilder(value).reverse().toString();
	}
}
