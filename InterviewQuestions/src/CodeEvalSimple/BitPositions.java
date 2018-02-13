package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BitPositions {
	
	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
		String[] splitInput = input.split(",");
		int num = Integer.parseInt(splitInput[0]);
		int p1 = Integer.parseInt(splitInput[1]);
		int p2 = Integer.parseInt(splitInput[2]);
		
		StringBuffer sb = new StringBuffer();
		
		while(num>1){
		sb.append(num%2);
		num = num/2;
		}
		sb.append(num);
		
		//to get the actual binary number we need to reverse the sb.
		char[] binaryDigit = sb.toString().toCharArray();
		
		if (binaryDigit[p1-1]==binaryDigit[p2-1]){
			System.out.println(true);
		}else
			System.out.println(false);
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
