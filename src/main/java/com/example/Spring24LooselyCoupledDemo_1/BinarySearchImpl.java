package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
//	we use @Autowired for specifying that sortAlgorthim is a dependency.
	@Autowired
	SortAlgorthim sortAlgorthim; 
	
	public int binarySearch(int[] arr,int ind) {
		
		int[] arr_result = sortAlgorthim.sort(arr);
		return arr[ind];
	}

}
