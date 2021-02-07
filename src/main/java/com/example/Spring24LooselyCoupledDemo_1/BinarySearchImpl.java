package com.example.Spring24LooselyCoupledDemo_1;

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
	
	@Autowired
	@Qualifier("merge")
	private SortAlgorthim sortAlgorthim; 
	
	public int binarySearch(int[] arr,int ind) {
		
		int[] arr_result = sortAlgorthim.sort(arr);
		
//		checking which bean is called.
		System.out.println(sortAlgorthim);
		return arr[ind];
	}

}
