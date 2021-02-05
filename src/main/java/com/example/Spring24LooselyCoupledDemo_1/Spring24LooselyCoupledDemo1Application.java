package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring24LooselyCoupledDemo1Application {

	
//	main start
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(Spring24LooselyCoupledDemo1Application.class, args);
		
//		using the application context we can call the bean which we requiere.
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
//		checking which bean is called.
		System.out.println(binarySearch);
		
		int result = binarySearch.binarySearch(new int[] {1,2,3},1);
		System.out.println(result);
	}

}
