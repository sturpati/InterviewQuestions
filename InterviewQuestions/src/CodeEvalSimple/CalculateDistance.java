package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculateDistance {
	public static void main(String [] args){
		for(String input : readFromFile(args[0])){
		String[] splitInput = input.split(" ");
		long x1 = Integer.parseInt(splitInput[0].substring(1, splitInput[0].length()-1));
		long y1= Integer.parseInt(splitInput[1].substring(0, splitInput[1].length()-1));
		long x2 = Integer.parseInt(splitInput[2].substring(1, splitInput[2].length()-1));
		long y2 = Integer.parseInt(splitInput[3].substring(0, splitInput[3].length()-1));
		
		double output =  Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2), 2));
		
		System.out.println((long)output);
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
