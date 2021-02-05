package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortAlgorthim {

	@Override
	public int[] sort(int[] arr) {
		
		for(int i :arr) {
			System.out.println(i);
		}
		return arr;
	}

}
