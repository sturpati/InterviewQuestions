package ArrayRelatedInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberDivByThree {
	/* 
	You have L, a list containing some digits (0 to 9).
	Write a function answer(L) which finds the largest number that can be made from some or all of these digits and is divisible by 3.
	If it is not possible to make such a number, return 0 as the answer. L will contain anywhere from 1 to 9 digits.
	The same digit may appear multiple times in the list, but each element in the list may only be used once. 
	 */
	
	public static void main(String[]args){
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(8);
		input.add(5);
		input.add(8);
		input.add(4);
		Collections.sort(input);
		
		System.out.println(input);
	}

}
