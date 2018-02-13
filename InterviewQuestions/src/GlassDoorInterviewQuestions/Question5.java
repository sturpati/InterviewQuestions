package GlassDoorInterviewQuestions;

/*
 * 
Reversing words in a sentence without library functions  

 */
public class Question5 {
	
	public static void main(String[]args){
		String inputs = "439 store(s) were successfully updated.";
		
		String[] splitInputs = inputs.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i=1; i<splitInputs.length;i++){
			sb.append(splitInputs[i] + " ");
		}
		System.out.print(sb.toString());
	}

}
