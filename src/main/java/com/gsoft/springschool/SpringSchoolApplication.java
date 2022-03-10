package com.gsoft.springschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSchoolApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringSchoolApplication.class, args);
		BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1
				= run.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);
	}

}
