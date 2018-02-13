package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {
	
	public static void main (String [] args){
		for(String input : readFromFile(args[0])){
			
			int size = input.length();
			double sum = 0;
			char[] splitInputs = input.toCharArray();
			for(char splitInput : splitInputs){
				double a = Math.pow((Integer.parseInt(String.valueOf(splitInput))),size);
				sum = sum + a;
			}
			
			if (Integer.parseInt(input) == Integer.valueOf((int)(sum))){
				System.out.println("True");
			}else {
				System.out.println("False");
			}
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
