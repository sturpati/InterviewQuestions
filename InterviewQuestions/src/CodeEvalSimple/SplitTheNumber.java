package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SplitTheNumber {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			String[] splitInputs = input.split(" ");

			char [] assignValue = splitInputs[0].toCharArray();
			char[] charInputs = splitInputs[1].toCharArray();
			int i = 0;
			StringBuffer sb = new StringBuffer();

			for (char charInput: charInputs){
				if(Character.isAlphabetic(charInput)){
					charInput = assignValue[i];
					sb.append(charInput);
					i++;
				}else{
					sb.append(charInput);
				}
			}
			//System.out.println(sb.toString());

			String newInput = sb.toString();
			char[] charNewInputs = newInput.toCharArray();
			long output = 0;

			for (char charNewInput : charNewInputs){
				if (charNewInput == '+'){
					String [] finalValues = newInput.split("\\+");
					output = Long.parseLong(finalValues[0])+Long.parseLong(finalValues[1]);

				} else if (charNewInput == '-') {
					String [] finalValues = newInput.split("\\-");
					output = Long.parseLong(finalValues[0])-Long.parseLong(finalValues[1]);

				}
			}

			System.out.println(output);
		}

	}

	public static List<String> readFromFile(String filePath){

		File file = new File(filePath);
		BufferedReader reader = null;
		List<String> result = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader(file));
			String stLine = null;
			while((stLine = reader.readLine()) != null) {
				result.add(stLine);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

}
