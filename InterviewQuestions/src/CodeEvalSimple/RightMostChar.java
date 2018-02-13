package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RightMostChar {
	
	public static void main(String[]args){
		for (String input: readFromFile(args[0])){
			if(!input.isEmpty()){
		String[] inputSplit = input.split(",");
		String inputString = inputSplit[0];
		char[] inputCharacter = inputSplit[1].toCharArray();
		
		System.out.println(inputString.indexOf(inputCharacter[0]));
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
