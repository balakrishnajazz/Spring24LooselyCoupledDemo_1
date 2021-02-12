package com.example.Spring24LooselyCoupledDemo_1;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
public class BinarySearchImpl {
	
//	Autowiring using the userdefined names using the
//	@Qualifier annotation.
	
	@Inject
	@Qualifier("quickSort")
	private SortAlgorthim sortAlgorthim; 
	
	public int binarySearch(int[] arr,int ind) {
		
		int[] arr_result = sortAlgorthim.sort(arr);
		
//		checking which bean is called.
		System.out.println(sortAlgorthim);
		return arr[ind];
	}

}
