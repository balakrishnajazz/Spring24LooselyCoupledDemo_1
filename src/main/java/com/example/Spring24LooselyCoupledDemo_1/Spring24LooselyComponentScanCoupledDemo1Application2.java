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



//Since the componentJdbcConnection and componentDao are outside of the package for that we need to perform
//componentscan for that we have to use @ComponentScan and specify the package name you want to search
@SpringBootApplication
@ComponentScan("com.example.componentscan")
public class Spring24LooselyComponentScanCoupledDemo1Application2 {
	
	private static Logger LOGGER = LoggerFactory.getLogger(Spring24LooselyComponentScanCoupledDemo1Application2.class);
	
//	main start
	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext = SpringApplication.run(Spring24LooselyComponentScanCoupledDemo1Application2.class, args);
		
		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
		ComponentDao componentDao2 = applicationContext.getBean(ComponentDao.class);
		
		LOGGER.info("{}",componentDao);
		LOGGER.info("{}",componentDao2);
	
	}

}
