package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OneZeroTwoZeros {

	public static void main (String [] args){
		StringBuffer sb = new StringBuffer();
		
		for (String input : readFromFile(args[0])){
			String[] splitInput = input.split(" ");
			int noOfZeros = Integer.parseInt(splitInput[0]);	
			int range = Integer.parseInt(splitInput[1]);
			int finalNoOfZeros = 0;

			for (int i=1; i<=range;i++){
				String binNum = getBinaryNumber(i);	
				char[] numbers = binNum.toCharArray();
				int count = 0;
				for (char number : numbers){
					if (number == '0'){
						count++;
					}
				}
				if (noOfZeros == count){
					finalNoOfZeros++;
				}
			}
			sb.append(finalNoOfZeros);
			sb.append("\n");
			//System.out.println(finalNoOfZeros);
		}
		System.out.println(sb.toString());
	}

	public static String getBinaryNumber(int i){
		StringBuffer sb = new StringBuffer();
		while(i>1){
			sb.append(i%2);
			i = i/2;
		}
		String binary = sb.append(i).reverse().toString();
		return binary;
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
