package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
//	Autowiring by using the name simply use the 
//	the name of the class which we autowire
	
//	If we want to call MergeSort algorthim simply use
//	mergeSort inplace of the quickSort
	
	@Autowired
	private SortAlgorthim quickSort; 
	
	public int binarySearch(int[] arr,int ind) {
		
		int[] arr_result = quickSort.sort(arr);
		
//		checking which bean is called.
		System.out.println(quickSort);
		return arr[ind];
	}

}
