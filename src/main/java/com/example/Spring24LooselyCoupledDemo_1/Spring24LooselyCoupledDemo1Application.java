package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Spring24LooselyCoupledDemo1Application {

	
	
//	main start
	public static void main(String[] args) {
		
//		we need to close the ApplicationConfigApplicationContext otherwise it will show data lekage.
//		we may use applicationContext.close() or we can use try with resources.
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Spring24LooselyCoupledDemo1Application.class)){

//			using the application context we can call the bean which we requiere.
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			
			
			int result = binarySearch.binarySearch(new int[] {1,2,3},1);
			System.out.println(result);
			
			applicationContext.close();

		}		
	}

}
