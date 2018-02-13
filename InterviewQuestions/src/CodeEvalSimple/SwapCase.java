package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SwapCase {
	
	//Write a program which swaps letters' case in a sentence. All non-letter characters should remain the same. 
	public static void main (String[]args){

		for(String input : readFromFile(args[0])){
		char[] splitInput = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for (char i:splitInput){
			 if(Character.isUpperCase(i)){
				 sb.append(Character.toLowerCase(i));
			 }

			 else if(Character.isLowerCase(i)){
				 sb.append(Character.toUpperCase(i));

			 }
			  
			 else{
				 sb.append(i);
			 }
			 
			
		}
		System.out.println(sb.toString());
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

/*
Hello world!
JavaScript language 1.8
A letter
*/

/*Question: how to know if a character is upper case or lower case using ASCII values?*/
