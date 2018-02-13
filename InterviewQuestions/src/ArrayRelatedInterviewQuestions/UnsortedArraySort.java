package ArrayRelatedInterviewQuestions;

import java.util.Arrays;

public class UnsortedArraySort {

	/* 
Given an unsorted array, sort it in such a way that the first 
element is the largest value, the second element is the smallest, 
the third element is the second largest element and so on. 
[2, 4, 3, 5, 1] -> [5, 1, 4, 2, 3]

	 */
	
	public static void main(String[] args){
		int[] input = {2,4,3,5,6,1};
		Arrays.sort(input);
		int n = input.length;
		int [] output = new int[n];
		int i=n-1;
		int j=0;
		int x=0;
		
		while(i>=j){
			output[x] = input[i];
			System.out.println(output[x]);
			x++;
			if(i == j) break;
			output[x] = input[j];
			System.out.println(output[x]);
			x++;
			i--;j++;
		}

	}
}
