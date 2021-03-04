package com.example.Spring24LooselyCoupledDemo_1.retervingdatafromfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//Loading properties file
@PropertySource("classpath:app.properties")
public class Spring24LooselyCoupledDemoRetervingDataFromFile {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Spring24LooselyCoupledDemoRetervingDataFromFile.class)){
			
			SomeExternalFile service = applicationContext.getBean(SomeExternalFile.class);
//			here we are getting the vlaue of the properties file.
			System.out.println(service.getUrl());
		}
	}

}
