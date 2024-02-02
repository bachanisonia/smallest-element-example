

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.learnjava.corejava.smallestelement.SmallestElement;

public class SmallestElementTest {

	SmallestElement se;
	
	
	@BeforeEach
	public void init()
	{
		se = new SmallestElement();
	}
	
	@Test
	public void smallestElementTestNullInput() 
	{
		int[] inputArr = null;
		int output = 0;
		int expected = 0;
		
		output = se.findKthSmallestElement(inputArr, 0);
		
		assertEquals(output, expected);
		
	}
	
	@Test
	public void smallestElementTestValidInput1()
	{
		int[] inputArr = {9,3,1,6,4};
		int output = 0;
		int expectedOutput = 4;
		
		output = se.findKthSmallestElement(inputArr, 3);
		
		assertEquals(output, expectedOutput);
		
	}
	
	
	@Test
	public void smallestElementTestValidInput2()
	{
		int[] inputArr = {99,36,14,61,4};
		int output = 0;
		int expectedOutput = 14;
		
		output = se.findKthSmallestElement(inputArr, 2);
		
		assertEquals(output, expectedOutput);
		
	}
	

}
