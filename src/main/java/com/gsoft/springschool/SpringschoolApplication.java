package com.gsoft.springschool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringschoolApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringschoolApplication.class, args);
		BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);
	}

}
