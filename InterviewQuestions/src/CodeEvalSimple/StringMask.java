package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringMask {

	public static void main (String [] args){
		for(String input : readFromFile(args[0])){
			String[] splitInput = input.split(" ");

			char[] word = splitInput[0].toCharArray();
			char[] binaryCode = splitInput[1].toCharArray();

			StringBuffer sb = new StringBuffer();
			for (int i = 0; i< word.length;i++){
				if (binaryCode[i] == '1'){
					sb.append(Character.toUpperCase(word[i]));
				}
				if (binaryCode[i] == '0'){
					sb.append(Character.toLowerCase(word[i]));
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
