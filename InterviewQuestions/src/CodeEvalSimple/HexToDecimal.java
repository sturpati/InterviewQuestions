package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HexToDecimal {

	public static void main (String [] args){
		for(String input: readFromFile(args[0])){
			char[] charInputs = input.toCharArray();
			int length = charInputs.length;
			double sum = 0;
			double toDecimal = 0;

			for (char charInput: charInputs){
				if(!Character.isAlphabetic(charInput)){
					toDecimal = Double.parseDouble(Character.toString(charInput)) * Math.pow(16, length-1);
				}else{
					if (charInput=='a'){
						toDecimal = 10 * Math.pow(16, length-1);
					}else if (charInput=='b'){
						toDecimal = 11 * Math.pow(16, length-1);
					}else if (charInput=='c'){
						toDecimal = 12 * Math.pow(16, length-1);
					}else if (charInput=='d'){
						toDecimal = 13 * Math.pow(16, length-1);
					}else if (charInput=='e'){
						toDecimal = 14 * Math.pow(16, length-1);
					}else if (charInput=='f'){
						toDecimal = 15 * Math.pow(16, length-1);
					}
				}
				length--;
				sum+=toDecimal;	
			}
			System.out.println((int)sum);
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
