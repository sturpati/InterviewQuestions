package General;

public class ReverseSentence {
	
	public static void main(String[]args){
		String input = "This  Ssentence123 $ is to be reveresed";	
		char[] charInputs = input.toCharArray();
		int length = charInputs.length;
		//System.out.println(length);
		
		StringBuffer sbWord = new StringBuffer();
		StringBuffer sbSentence = new StringBuffer();
		
		for (int i=length-1; i>=0;i--){
			if(charInputs[i] == ' '){
				sbWord.reverse();
				sbSentence.append(sbWord.toString());
				sbWord.delete(0, sbWord.length());
				sbSentence.append(charInputs[i]);
			}else{
				sbWord.append(charInputs[i]);

			}
		}
		System.out.println(sbSentence.append(sbWord.reverse().toString()));
	}

}
