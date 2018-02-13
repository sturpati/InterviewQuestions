package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RollerCoaster {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
		char[] charInputs = input.toCharArray();
		boolean upperCase = true;

		StringBuffer sb = new StringBuffer();

		for (char charInput : charInputs){
			if(Character.isAlphabetic(charInput)){

				if (upperCase==true) {
					sb.append(Character.toUpperCase(charInput));
					upperCase = false;
				}else if (upperCase==false){
					sb.append(Character.toLowerCase(charInput));
					upperCase = true;
				}
			}else{

				sb.append(charInput);
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
