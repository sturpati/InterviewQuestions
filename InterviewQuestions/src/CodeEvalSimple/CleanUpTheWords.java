package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CleanUpTheWords {
	
	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
		char [] charInputs = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		boolean space = false;
		
		for (char charInput : charInputs){
			
			if (Character.isAlphabetic(charInput)){
				if (space==true){
					sb.append(" ");
				}
				sb.append(Character.toLowerCase(charInput));
				space = false;
				
			}else  {
				space = true;
			}
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
