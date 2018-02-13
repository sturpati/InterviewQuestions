package ArrayRelatedInterviewQuestions;

public class AlphaNum {
	
	/*
Given String is "a4b2c2a3f1g2" and out put should be "aaaabbccaaafgg" . the number after char is the occurance of that character in string

	 */

	public static void main(String[] args){
		String input = "a4b2c2a3f1g2";
		char[] inputChar = input.toCharArray();
		int n = inputChar.length;
		int i =0;
		int j=1;
		StringBuffer sb = new StringBuffer();
		
		while(j<n){
			char alpha = inputChar[i];
			System.out.println(alpha);
			int alphaNum = Integer.parseInt(Character.toString(inputChar[j]));
			System.out.println(alphaNum);
			i=i+2; j=j+2;			
		}
			
	
	}
}
