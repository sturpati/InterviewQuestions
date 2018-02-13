package ArrayRelatedInterviewQuestions;

public class FrequencyOfNumber {
	
	//https://www.careercup.com/question?id=5730002487214080
	
	
	public static void main(String[]args){
		int[] inputArray = {1,1,1,1,1,1,2,3,3,2,2};
		int inputNumber = 1;
		int total = 0;
		
		for(int input : inputArray){
			if(input==inputNumber){
				total++;
			}
		}
		System.out.println(total);
	}

}

 