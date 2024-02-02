package com.learnjava.corejava.smallestelement;

import java.util.ArrayList;
import java.util.List;

public class SmallestElement {

	
	//int[] inputArr = {10,2,3,4,1};
	
	List<Integer> outputArr = new ArrayList<>();
	
	//String inputList = "9 6 3 2 5 7 4";
	//String inputList = "1 2 4 3 5 6";
	
	
	public int[] sortArray(int[] inputArr)
	{
		
		int i=0;
		int j=0;
		int temp=0;
		int len = inputArr.length;
		
		for (i=0; i<len; i++)
		{
			
			for (j=i+1; j<len; j++)
			{
				if (inputArr[i] > inputArr[j])
				{
					temp = inputArr[i];
					inputArr[i] = inputArr[j];
					inputArr[j] = temp;
					
					// If Last element check is completed
					if (j==len-1) { break; }
					
					j=i+1;
					
					continue;
				}
				else 
				{
					continue;
				}
				
			}
			
		}
		
		//System.out.println("The sorted array is : " + inputArr);
		for (int i1=0; i1 < len; i1++)
		{
			System.out.println(inputArr[i1]);
		}
		
		return inputArr;
	}
	
	
	public int findKthSmallestElement(int inputArr[], int element)
	{
		if (inputArr == null) 
		{
			System.out.println("The input array is null");
			return 0;
		}
		
		int[] sortedArr;
		// Sorting the array first
		sortedArr = sortArray(inputArr);
		
		// Return the Kth element
		System.out.println("The " + element + "th" + " smallest element in the array is " + sortedArr[element -1]);
		return sortedArr[element -1];
		
	}
	
}
