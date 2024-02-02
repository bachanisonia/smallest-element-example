package com.learnjava.corejava;

import com.learnjava.corejava.smallestelement.SmallestElement;

public class SmallestElementExample {

	public static void main(String[] args) {
		
		
		int[] inputArr = {10,2,3,4,1};
		
		System.out.println("The input array is : ");
		
		for (int i=0; i<inputArr.length; i++)
		{
			System.out.println(inputArr[i]);
		}
		
		SmallestElement se = new SmallestElement();
		
		se.findKthSmallestElement(inputArr, 3);
		
	}

}
