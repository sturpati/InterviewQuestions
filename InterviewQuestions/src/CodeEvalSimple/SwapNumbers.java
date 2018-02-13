package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SwapNumbers {
	
	public static void main(String [] args){
		for(String input : readFromFile(args[0])){
		String[] splitInputs = input.split(" ");
		
		StringBuffer sb = new StringBuffer();
		
		
		for (String splitInput: splitInputs){
			int size = splitInput.length();
			
			 char firstNumber = splitInput.toCharArray()[0];
			 char lastNumber = splitInput.toCharArray()[size-1];
			 String swapCase = splitInput.substring(1, size-1);
			 sb.append(lastNumber + swapCase + firstNumber + " ");
		}
		
		System.out.println(sb.toString().trim());
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
