package com.example.unittesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnittestingApplication {

	public int add(int a, int b) {
		return a-b;
	}


	public static void main(String[] args) {
		SpringApplication.run(UnittestingApplication.class, args);
	}

}
