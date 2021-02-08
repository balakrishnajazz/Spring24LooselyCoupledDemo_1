package com.example.Spring24LooselyCoupledDemo_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.Spring24LooselyCoupledDemo_1.basicsortingdemo.BinarySearchImpl;
import com.example.Spring24LooselyCoupledDemo_1.scope.PersonDao;
import com.example.componentscan.ComponentDao;



@SpringBootApplication
public class Spring24LooselyLifeCycleCoupledDemo1Application3 {
	
	private static Logger LOGGER = LoggerFactory.getLogger(Spring24LooselyLifeCycleCoupledDemo1Application3.class);
	
//	main start
	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext = SpringApplication.run(Spring24LooselyLifeCycleCoupledDemo1Application3.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		
		LOGGER.info("{}",binarySearch);
//		LOGGER.info("{}",binarySearch2);
	
	}

}
