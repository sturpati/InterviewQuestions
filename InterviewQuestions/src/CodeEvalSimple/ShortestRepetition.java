package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShortestRepetition {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			char[] inputChars = input.toCharArray();
			int length = inputChars.length;
			char firstLetter = inputChars[0];
			StringBuffer sb = new StringBuffer();
			sb.append(firstLetter);

			for(int i=1; i<length;i++){
				if (firstLetter == inputChars[i]){
					break;
				}
				sb.append(inputChars[i]);
			}
			System.out.println(sb.toString().length());
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
