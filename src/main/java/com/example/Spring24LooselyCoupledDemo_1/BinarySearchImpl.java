package com.example.Spring24LooselyCoupledDemo_1;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
public class BinarySearchImpl {
	
	
	private Logger LOGGER = LoggerFactory.getLogger(Spring24LooselyCoupledDemo1Application.class);
	
//	Autowiring using the userdefined names using the
//	@Qualifier annotation.
	
	@Inject
	@Qualifier("quickSort")
	private SortAlgorthim sortAlgorthim; 
	
	public int binarySearch(int[] arr,int ind) {
		
		int[] arr_result = sortAlgorthim.sort(arr);
		
//		checking which bean is called.
			LOGGER.info("{}",sortAlgorthim);
		
		return arr[ind];
	}

}
