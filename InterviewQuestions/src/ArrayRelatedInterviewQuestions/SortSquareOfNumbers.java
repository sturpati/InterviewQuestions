package ArrayRelatedInterviewQuestions;

import java.util.Arrays;

public class SortSquareOfNumbers {
	
	//https://www.careercup.com/question?id=5733252603052032
	
	public static void main(String[] args){
		int[] inputArray = {-6,-3,-1,2,4,5};
		int output =0;
		int[] outputArray = new int[inputArray.length];
		int i=0;
		
		for(int input : inputArray){
			output = input*input;
			outputArray[i] = output;
			i++;
		}
		Arrays.sort(outputArray);
		
		for(int outputA:outputArray){
		System.out.println(outputA);
		}

	}

}
