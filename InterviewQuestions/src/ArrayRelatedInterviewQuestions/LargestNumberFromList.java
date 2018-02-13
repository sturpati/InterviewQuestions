package ArrayRelatedInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumberFromList {

	public static void main (String[] args){
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(8);
		input.add(5);
		input.add(8);
		input.add(4);
		String largestNumber = largestNumber(input);
		System.out.println(largestNumber);

	}

	public static String largestNumber(List<Integer> input){
		int size = input.size();
		int remove = 0;
		int j=0;
		StringBuffer sb = new StringBuffer();

		while(j<size){
			int previousNumber = 0;
			int largestNumber = 0;

			for(int i=0;i<size;i++){
				previousNumber = input.get(i);

				if(previousNumber>largestNumber){
					largestNumber=previousNumber;
					remove = i;
				}
			}
			sb.append(largestNumber);
			input.remove(remove);
			size = input.size();

		}
		String largestNumber = sb.toString();
		return largestNumber;

	}
	
	
}
