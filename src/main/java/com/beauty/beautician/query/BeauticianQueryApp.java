package com.beauty.beautician.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class BeauticianQueryApp 
{
	public static void main(String[] args) {
		SpringApplication.run(BeauticianQueryApp.class, args);
	}
}
