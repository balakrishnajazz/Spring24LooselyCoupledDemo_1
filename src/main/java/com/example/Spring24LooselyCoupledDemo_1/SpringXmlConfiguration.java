package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.example.Spring24LooselyCoupledDemo_1.xmljdbcconnection.XmlPersonDao;

@Configuration
@ComponentScan
public class SpringXmlConfiguration {

//	main start
	public static void main(String[] args) {
		
//		Instead of ApplicationContext we are using the XmlJdbcConnection
//		For the usage of this we need to configure the xml file
//		For that see the applicationContext.xml file.
		
//		If we use this apporach we need to add the a lot of the line in the applicationContext file
//		Inorder to avoid that we use the annotation apporach.

		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);
			System.out.println(personDao);

		}		
	}

}
