package GlassDoorInterviewQuestions;

/*
 * Reverse a string  
 */
public class Question4 {

	public static void main(String[]args){
		char[] inputs = "reverse".toCharArray();
		
		StringBuffer sb = new StringBuffer();
		int n = inputs.length;
		for(int i=n;i>0;i--){
			sb.append(inputs[i-1]);
		}
		System.out.print(sb.toString());
	}
}
