package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JugglingWithZeros {

	public static void main(String[] args){
		for (String input : readFromFile(args[0])){
			String[] splitInputs = input.split(" ");
			int length = 0;

			StringBuffer sb = new StringBuffer();
			for (int i=0;i<splitInputs.length;i++){
				if (splitInputs[i].equalsIgnoreCase("00")){
					length = splitInputs[i+1].length();
					for (int j=0; j< length;j++){
						sb.append(1);
					}

				}else{
					sb.append(splitInputs[i+1]);
				}
				i++;
			}

			char[] binaryNums = sb.toString().toCharArray();
			int numLength = binaryNums.length;
			double intNumber = 0;

			for (char binaryNum : binaryNums){
				intNumber += (Double.parseDouble(Character.toString(binaryNum)) * Math.pow(2, numLength-1));
				numLength--;
			}
			System.out.println((long)intNumber);
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
