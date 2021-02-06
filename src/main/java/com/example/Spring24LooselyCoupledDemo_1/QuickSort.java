package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("quick")
public class QuickSort implements SortAlgorthim {

	@Override
	public int[] sort(int[] arr) {
		System.out.println("In the Quicksort");
		for(int i :arr) {
			System.out.println(i);
		}
		return arr;
	}

}
