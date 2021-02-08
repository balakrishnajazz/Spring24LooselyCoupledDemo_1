package com.example.Spring24LooselyCoupledDemo_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Spring24LooselyCoupledDemo_1.basicsortingdemo.BinarySearchImpl;
import com.example.Spring24LooselyCoupledDemo_1.scope.PersonDao;

@SpringBootApplication
public class Spring24LooselyCoupledDemo1Application {
	
	private static Logger LOGGER = LoggerFactory.getLogger(Spring24LooselyCoupledDemo1Application.class);
	
//	main start
	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext = SpringApplication.run(Spring24LooselyCoupledDemo1Application.class, args);
		
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
		
//		For getting the log information we will use this.
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
//		suppose if we call the getJDBCConnection it will return the jdbc connection will new instance.
//		According to spring there is one instance for application in the spring jvm
//		According to gof (gang of ford ) there is one instance a
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}

}
