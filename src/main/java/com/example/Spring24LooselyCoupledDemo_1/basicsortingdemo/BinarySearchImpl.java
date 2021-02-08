package com.example.Spring24LooselyCoupledDemo_1.basicsortingdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//It will create only one instance and same will be used for all other objects.
//One Instance per Spring Context
//single :- One instance per Spring context
//prototype :- New bean whenever requested
//request :- One bean per Http request
//session :- One bean per session
@Component
//since here we are hardcoding the data it is not prefered.
//instead of that we use ConfigurableBeanFactory.SCOPE_SINGLETON.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  
public class BinarySearchImpl {
	
//	Autowiring using the userdefined names using the
//	@Qualifier annotation.
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("merge")
	private SortAlgorthim sortAlgorthim; 
	
	public int binarySearch(int[] arr,int ind) {
		
		int[] arr_result = sortAlgorthim.sort(arr);
		
//		checking which bean is called.
		System.out.println(sortAlgorthim);
		return arr[ind];
	}

//	Before the dependencies are populated the post constructor is called.
//	After that the beans are intialled.
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postconstruct");
	}
	
//	just before the bean is destroyed
//	This method is called.
	@PreDestroy
	public void preDestory() {
		LOGGER.info("preDestroy");
		System.out.println("preDestroy");
	}
}
