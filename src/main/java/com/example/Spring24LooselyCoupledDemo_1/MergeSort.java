package com.example.Spring24LooselyCoupledDemo_1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("merge")
public class MergeSort implements SortAlgorthim {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("In the MergeSort");
		return arr;
	}

}
