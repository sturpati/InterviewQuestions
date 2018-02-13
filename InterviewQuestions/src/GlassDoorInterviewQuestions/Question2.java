package GlassDoorInterviewQuestions;

/*
 * input string = aabbbccccaaa, maintain the insertion order and output should be a2b3c4a3  
 */
public class Question2 {
	
	public static void main (String[]args){
		char[] inputs = "aabbcdd".toCharArray();
		StringBuffer sb = new StringBuffer();
		char firstValue = inputs[0];
		int count = 0;
		
		for(char input : inputs){
			if (firstValue == input){
				count++;
		
			}else{
			sb.append(firstValue);
			sb.append(count);
			firstValue = input;

			 count = 1;
			}
	
		}
		sb.append(firstValue);
		sb.append(count);
		
		System.out.print(sb.toString());
		
		
	}

}
