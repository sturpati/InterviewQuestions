package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LettercasePercentageRatio {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			char[] charInputs = input.toCharArray();
			double size = charInputs.length;
			double lowerCase = 0;
			double upperCase = 0;

			for(char charInput : charInputs){
				if(Character.isLowerCase(charInput)){
					lowerCase ++;
				}
				if(Character.isUpperCase(charInput)){
					upperCase ++;
				}
			}
			double perRatioLower = (lowerCase/size)*100;
			double perRatioUpper = (upperCase/size)*100;
			//BigDecimal lower = new BigDecimal(perRatioLower);
			//BigDecimal upper = new BigDecimal(perRatioUpper);
			
			//System.out.println("lowercase: "+lower.setScale(2,BigDecimal.ROUND_HALF_UP)+ " uppercase: "+upper.setScale(2,BigDecimal.ROUND_HALF_UP));
			System.out.println(String.format("%02.2f",perRatioUpper));
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
