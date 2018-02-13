package CodeEvalSimpleNotCompleted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RacingChars {
	
	public static void main (String [] args){
		int previousPosition = 0;
	
		for (String input : readFromFile(args[0])){
			StringBuffer sb = new StringBuffer();
			String racingTrack = null;
			char[] racingChars = input.toCharArray();
			int position = 0;
			int finalPosition = 0;
			boolean checkpoint = false;
			boolean gate = false;
			for (char racingChar : racingChars){
				position++;
				if (racingChar == '_'){
					finalPosition = position;
					gate = true;
				}else if (racingChar == 'C'){
					finalPosition = position;
					checkpoint = true;
				}
				 racingTrack = sb.append(racingChar).toString();
				 if (checkpoint==true){
					 previousPosition = finalPosition;
					 break;
				 }else if (gate==true && checkpoint==false){
					 previousPosition = finalPosition;
				 }
			}
			
				System.out.println(racingTrack);
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
