package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	

	
	SortAlgorthim sortAlgorthim; 

//	AutoWired Using the setter injection.
	@Autowired
	public void setSortAlgorthim(SortAlgorthim sortAlgorthim) {
		this.sortAlgorthim = sortAlgorthim;
		System.out.println("Setter was called");
	}



	public int binarySearch(int[] arr,int ind) {
		
		int[] arr_result = sortAlgorthim.sort(arr);
		return arr[ind];
	}

}
